package it.reexon.jdatastructures.structures;

import java.util.ArrayList;

import it.reexon.jdatastructures.exceptions.EmptyHeapException;


public class MinHeap<T extends Comparable<T>> extends AbstractHeap<T>
{
    /**
     * 
     */
    public MinHeap()
    {
        super();
    }

    /**
     * @param arrayList
     */
    public MinHeap(ArrayList<T> arrayList)
    {
        super(arrayList);
    }

    /**
     * @param array
     */
    public MinHeap(T[] array)
    {
        super(array);
    }

    @Override
    protected void buildHeap()
    {
        if (this.heapSize > 0)
        {
            for (int i = (int) (heapSize / 2); i >= 0; i--)
            {
                this.minHeapify(i);
            }
        }
    }

    /**
     * 
     * @param i
     */
    private void minHeapify(int i)
    {
        if (this.heapSize > 0)
        { // More Than One Element
            int l = 2 * i; // i Left Son
            int r = 2 * i + 1; // i Right Son
            int min = i;
            if (l <= this.heapSize)
            {
                if ((this.heapArrList.get(l)).compareTo(this.heapArrList.get(min)) < 0)
                {
                    min = l;
                }
            }
            if (r <= this.heapSize)
            {
                if (this.heapArrList.get(r).compareTo(this.heapArrList.get(min)) < 0)
                {
                    min = r;
                }
            }
            if (min != i)
            {
                T swap = this.heapArrList.get(i);
                this.heapArrList.set(i, this.heapArrList.get(min));
                this.heapArrList.set(min, swap);
                this.minHeapify(min);
            }
        }
    }

    /**
     * 
     * @return
     * @throws EmptyHeapException
     */
    public T extractMinValue() throws EmptyHeapException
    {
        if (this.heapArrList.size() == 0)
        {
            throw new EmptyHeapException("AbstractHeap Is Empty");
        }
        T minValue = this.heapArrList.get(0);
        T lastValue = this.heapArrList.get(this.heapSize);
        this.heapArrList.set(0, lastValue);
        this.heapArrList.remove(this.heapSize);
        this.heapSize = this.heapSize - 1;
        this.minHeapify(0);
        return minValue;
    }

    /**
     * 
     */
    public void insert(T value)
    {
        this.heapArrList.add(value);
        this.heapSize++;
        this.buildHeap();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("MaxHeap []");
    }
}
