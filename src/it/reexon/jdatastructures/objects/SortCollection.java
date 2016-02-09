/**
 * 
 */
package it.reexon.jdatastructures.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import it.reexon.jdatastructures.exceptions.EmptyHeapException;
import it.reexon.jdatastructures.exceptions.OutOfBoundException;
import it.reexon.jdatastructures.objects.interfaces.SortInteface;


/**
 * @author marco.velluto
 *
 */
public class SortCollection<T extends Comparable<T>> implements Collection<T>, SortInteface<T>
{
    private Collection<T> collectionSort;

    public SortCollection(Collection<T> collectionSort)
    {
        this.setCollectionSort(collectionSort);
    }

    public int size()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean contains(Object o)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator<T> iterator()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("hiding")
    public <T> T[] toArray(T[] a)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean add(T e)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean remove(Object o)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> c)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(Collection<? extends T> c)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeAll(Collection<?> c)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection<?> c)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear()
    {
        // TODO Auto-generated method stub

    }

    /**
     * @return the collectionSort
     */
    public Collection<T> getCollectionSort()
    {
        return collectionSort;
    }

    /**
     * @param collectionSort the collectionSort to set
     */
    public void setCollectionSort(Collection<T> collectionSort)
    {
        this.collectionSort = collectionSort;
    }

    public void bubbleSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void bubbleSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void bubbleSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void bubbleSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void exceptionOutOfBoundThrower(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public T[] getArray()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public ArrayList<T> getArrayList()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void heapSort() throws OutOfBoundException, EmptyHeapException
    {
        // TODO Auto-generated method stub

    }

    public void heapSort(int leftBound, int rightBound) throws OutOfBoundException, EmptyHeapException
    {
        // TODO Auto-generated method stub

    }

    public void heapSortFrom(int indexFrom) throws OutOfBoundException, EmptyHeapException
    {
        // TODO Auto-generated method stub

    }

    public void heapSortTo(int indexTo) throws OutOfBoundException, EmptyHeapException
    {
        // TODO Auto-generated method stub

    }

    public void insertionSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void insertionSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void insertionSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void insertionSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public boolean isSorted()
    {
        // TODO Auto-generated method stub
        return false;
    }

    public void mergeHybridSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeHybridSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeHybridSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeHybridSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void printArray()
    {
        // TODO Auto-generated method stub

    }

    public void selectionSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void selectionSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void selectionSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void selectionSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void shellSort() throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void shellSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void shellSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void shellSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeParallelSort()
    {
        // TODO Auto-generated method stub

    }

    public void mergeParallelSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeParallelSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeParallelSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortHybridParallel()
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortHybridParallel(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortHybridParallelFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void mergeSortHybridParallelTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickSort()
    {
        // TODO Auto-generated method stub

    }

    public void quickSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickHybridSort()
    {
        // TODO Auto-generated method stub

    }

    public void quickHybridSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickHybridSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickHybridSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSort()
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortHybrid()
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortHybrid(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortHybridFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void quickParallelSortHybridTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void treeSort()
    {
        // TODO Auto-generated method stub

    }

    public void treeSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void treeSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void treeSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void countingSort()
    {
        // TODO Auto-generated method stub

    }

    public void countingSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void countingSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void countingSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void introSort()
    {
        // TODO Auto-generated method stub

    }

    public void introSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void introSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void introSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void smoothSort()
    {
        // TODO Auto-generated method stub

    }

    public void smoothSort(int leftBound, int rightBound) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void smoothSortFrom(int indexFrom) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

    public void smoothSortTo(int indexTo) throws OutOfBoundException
    {
        // TODO Auto-generated method stub

    }

}
