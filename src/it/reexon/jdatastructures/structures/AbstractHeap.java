/**
 * 
 */
package it.reexon.jdatastructures.structures;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * @author marco.velluto
 * @param <T>
 */
public abstract class AbstractHeap<T extends Comparable<T>>
{
    protected ArrayList<T> heapArrList;
    protected int heapSize;

    /**
     * 
     */
    public AbstractHeap()
    {
        this.heapSize = -1;
        this.heapArrList = new ArrayList<T>();
    }

    /**
     * 
     * @param arrayList
     */
    public AbstractHeap(ArrayList<T> arrayList)
    {
        this.heapSize = arrayList.size() - 1;
        this.heapArrList = arrayList;
        this.buildHeap();
    }

    /**
     * 
     * @param array
     */
    public AbstractHeap(T[] array)
    {
        this.heapArrList = new ArrayList<T>();
        for (int i = 0; i < array.length; i++)
        {
            this.heapArrList.add(array[i]);
        }
        this.heapSize = this.heapArrList.size() - 1;
        this.buildHeap();
    }

    protected abstract void buildHeap();

    /**
     * @return the heapArrList
     */
    public ArrayList<T> clone()
    {
        return this.heapArrList;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractHeap<?> other = (AbstractHeap<?>) obj;
        if (heapArrList == null)
        {
            if (other.heapArrList != null)
                return false;
        }
        else if (!heapArrList.equals(other.heapArrList))
            return false;
        if (heapSize != other.heapSize)
            return false;
        return true;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((heapArrList == null) ? 0 : heapArrList.hashCode());
        result = prime * result + heapSize;
        return result;
    }

    public void insert(T value)
    {
        this.heapArrList.add(value);
        this.heapSize++;
        this.buildHeap();
    }

    /**
     * Create An Array With The Elements Of The Max AbstractHeap
     * @return The Array
     */
    @SuppressWarnings("unchecked") //TOGLIERE WARNING
    public T[] toArray()
    {
        T[] arr = this.heapArrList.toArray((T[]) Array.newInstance(this.heapArrList.get(0).getClass(), this.heapSize));
        return arr;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public abstract String toString();
}
