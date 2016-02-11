package it.reexon.jdatastructures.structures;

import java.util.ArrayList;

import it.reexon.jdatastructures.exceptions.EmptyHeapException;


public class MaxHeap<T extends Comparable<T>> extends Heap<T>
{

    /**
     * 
     */
    public MaxHeap()
    {
        super();
    }

    /**
     * @param arrayList
     */
    public MaxHeap(ArrayList<T> arrayList)
    {
        super(arrayList);
    }

    /**
     * @param array
     */
    public MaxHeap(T[] array)
    {
        super(array);
    }

    @Override
    protected void buildHeap()
    {
        if (super.heapSize > 0)
        {
            for (int i = (int) (super.heapSize / 2); i >= 0; i--)
            {
                this.MaxHeapify(i);
            }
        }
    }

    /**
     * 
     * @param i
     */
    private void MaxHeapify(int i)
    {
        if (super.heapSize > 0)
        { // More Than One Element
            int l = 2 * i; // i Left Son
            int r = 2 * i + 1; // i Right Son
            int Max = i;
            if (l <= super.heapSize)
            {
                if ((super.heapArrList.get(l)).compareTo(super.heapArrList.get(Max)) > 0)
                {
                    Max = l;
                }
            }
            if (r <= super.heapSize)
            {
                if (super.heapArrList.get(r).compareTo(super.heapArrList.get(Max)) > 0)
                {
                    Max = r;
                }
            }
            if (Max != i)
            {
                T swap = super.heapArrList.get(i);
                super.heapArrList.set(i, super.heapArrList.get(Max));
                super.heapArrList.set(Max, swap);
                this.MaxHeapify(Max);
            }
        }
    }

    /**
     * 
     * @return
     * @throws EmptyHeapException
     */
    public T extractMaxValue() throws EmptyHeapException
    {
        if (this.heapArrList.size() == 0)
        {
            throw new EmptyHeapException("Heap Is Empty");
        }
        T MaxValue = this.heapArrList.get(0);
        T lastValue = this.heapArrList.get(this.heapSize);
        this.heapArrList.set(0, lastValue);
        this.heapArrList.remove(this.heapSize);
        this.heapSize = this.heapSize - 1;
        this.MaxHeapify(0);
        return MaxValue;
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
