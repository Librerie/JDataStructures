package it.reexon.jdatastructures.structures;

public class MaxHeap<T extends Comparable<T>> extends Heap<T>
{

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("MaxHeap []");
    }
}
