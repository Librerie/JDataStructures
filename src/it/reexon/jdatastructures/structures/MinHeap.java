package it.reexon.jdatastructures.structures;

public class MinHeap<T extends Comparable<T>> extends Heap<T>
{

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("MaxHeap []");
    }
}
