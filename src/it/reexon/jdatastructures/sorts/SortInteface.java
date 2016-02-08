package it.reexon.jdatastructures.sorts;

import java.util.ArrayList;

import it.reexon.jdatastructures.exceptions.EmptyHeapException;
import it.reexon.jdatastructures.exceptions.OutOfBoundException;


public interface SortInteface<T>
{

    //#################################################################
    //  Bubble Sort
    //################################################################  

    /**
     * 
     * Calls Bubble Sort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void bubbleSort() throws OutOfBoundException;

    /** 
     * 
     * BubbleSort Implementation:
     * 
     * <p><pre>
     * Worst Case: O(n^2)
     * Average Case: O(n^2)
     * Best Case: O(n)
     * </pre><p>
     * 
     * The Bubble Sort Works By Comparing Every Adjacent Couple Of Elements
     * And Swapping Them If They Are At The Wrong Positions, For Every Adjacent
     * Couple In The List. When The Array Ends, The Algorithm Restart Again, Repeating
     * Itself Until No Swaps Are Done.
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void bubbleSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * Calls Bubble Sort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void bubbleSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls Bubble Sort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void bubbleSortTo(int indexTo) throws OutOfBoundException;

    /**
     * 
     * Throws Exception OutOfBound
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void exceptionOutOfBoundThrower(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * Return The Sorted Array
     * 
     * @return The Array
     * 
     */
    public T[] getArray();

    /**
     * 
     * Return The Sorted ArrayList
     * 
     * @return The ArrayList
     * 
     */
    public ArrayList<T> getArrayList();

    //#################################################################
    //  Heap Sort
    //#################################################################

    /**
     * 
     * Calls HeapSort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * @throws EmptyHeapException 
     * 
     */
    public void heapSort() throws OutOfBoundException, EmptyHeapException;

    /** 
     * HeapSort Implementation:
     * 
     * <p><pre>
     * Worst Case: O(nlogn)
     * Average Case: O(nlogn)
     * Best Case: O(nlogn)
     * </pre><p>
     * 
     * The Algorithms Works By Creating A MinHeap With The Array And By Extracting
     * Minimum Value From THe Heap, Until The Heap Is Empty
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * @throws EmptyHeapException 
     * 
     */
    public void heapSort(int leftBound, int rightBound) throws OutOfBoundException, EmptyHeapException;

    /**
     * Calls HeapSort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * @throws EmptyHeapException 
     * 
     */
    public void heapSortFrom(int indexFrom) throws OutOfBoundException, EmptyHeapException;

    /**
     * 
     * Calls HeapSort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException
     * @throws EmptyHeapException 
     *  
     */
    public void heapSortTo(int indexTo) throws OutOfBoundException, EmptyHeapException;

    //#################################################################
    //  Insertion Sort
    //################################################################  

    /**
     * 
     * Calls Insertion Sort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void insertionSort() throws OutOfBoundException;

    /**
     * 
     * Insertion Sort Implementation:
     * 
     * <p><pre>
     * Worst Case: O(n^2)
     * Average Case: O(n^2)
     * Best Case: O(n) 
     * </pre><p>
     * 
     * Insertion Sort Works By Dividing The Array In Two Sublist, 
     * The Ordered One And The Non Ordered One. At The Beginning,
     * The Ordered List Is Formed By The First Element Of The Array, 
     * And The Not Ordered One Corresponds To The Array To Sort Minus
     * The First Element. The Algorithm At Every Step Takes The First
     * Element From The Not Ordered List Value And Places It In The End 
     * Of The Ordered One, By Comparing The Values Of The Added Element
     * With Every Other One Element Of The Ordered List
     * At The End Of The Algorithm The Ordered List Is The Sorted Array, 
     * While The Other List Is Empty.
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException
     * 
     */
    public void insertionSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * Calls Insertion Sort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException
     *  
     */
    public void insertionSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls Insertion Sort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void insertionSortTo(int indexTo) throws OutOfBoundException;

    /**
     * Check If The Array Is Sorted Correctly
     */
    public boolean isSorted();

    //#################################################################
    //  Merge Sort Hybrid
    //#################################################################

    /**
     * 
     * Calls MergeSort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeHybridSort() throws OutOfBoundException;

    /** 
     * MergeSort Hybrid Implementation:
     * 
     * <p><pre>
     * Worst Case: O(nlogn)
     * Average Case: O(nlogn)
     * Best Case: O(nlogn)
     * </pre><p>
     * 
     * Works As MergeSort, Except That Calls The InsertionSort Algorithm
     * If The Current Array's Lenght Is Less Than 10, Since InsertionSort
     * Is The Fastest Algorithm On Small Input
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeHybridSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * Calls MergeSort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeHybridSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls MergeSort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException
     *  
     */
    public void mergeHybridSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Merge Sort
    //#################################################################

    /**
     * 
     * Calls MergeSort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeSort() throws OutOfBoundException;

    /** 
     * MergeSort Implementation:
     * 
     * <p><pre>
     * Worst Case: O(nlogn)
     * Average Case: O(nlogn)
     * Best Case: O(nlogn)
     * </pre><p>
     * 
     * The Algorithms Works By Splicing The Input In Two And Calling Recursively
     * MergeSort On The Two Lists. If The List Has Only One Elements Stops The
     * Recursion, Otherwise Calls The Merge Function On The Two Sublists,
     * That Fuses The Two Ordered Lists Into A Single Ordered One.
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * Calls MergeSort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void mergeSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls MergeSort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException
     *  
     */
    public void mergeSortTo(int indexTo) throws OutOfBoundException;

    /**
     * 
     * Print The Sorted Array To The Screen
     * 
     */
    public void printArray();

    //#################################################################
    //  Selection Sort
    //################################################################  

    /**
     * 
     * Calls Selection Sort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void selectionSort() throws OutOfBoundException;

    /** 
     * 
     * Selection Sort Implementation:
     * 
     * <p><pre>
     * Worst Case: O(n^2)
     * Average Case: O(n^2)
     * Best Case: O(n^2) 
     * </pre><p>
     * 
     * Selection Sort Works By Dividing The Array In Two Sublist, 
     * The Ordered One And The Non Ordered One. At The Beginning,
     * The Ordered List Is Empty, And The Not Ordered One Corresponds 
     * To The Array To Sort. The Algorithm At Every Step Selects From
     * The Not Ordered List The Minimum Value And Places It At The End 
     * Of The Ordered One.
     * At The End Of The Algorithm The Ordered List Is The Sorted Array, 
     * While The Other List Is Empty.
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void selectionSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * Calls Selection Sort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void selectionSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls Selection Sort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void selectionSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Shell Sort
    //################################################################  

    /**
     * 
     * Calls Shell Sort On The Whole Array
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void shellSort() throws OutOfBoundException;

    /** 
     * 
     * Shell Sort Implementation With Fibonacci'sNumbers: 
     * 
     * <p><pre>
     * Worst Case: Depends On Input
     * Average Case: Depends On Input
     * Best Case: O(n)
     * </pre><p>
     * 
     * The Algorithm Works By Dividing The Array In h List, And Calling 
     * Insertion Sort On Them. It Then Proceeds To Lower The h Value And
     * Recalling Insertion Sort On The New Created Lists, Until h Reaches
     * 1. In This Implementation, The h Values Are Calculated By Using 
     * Fibonacci's Numbers, With The First h Value As The Bigger Fibonacci's
     * Number Less Than The Array's Length.
     * 
     * @param leftBound Left Limit For The Range Of Array's Values To Sort
     * @param rightBound Right Limit For The Range Of Array's Values To Sort
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void shellSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * Calls Shell Sort From Index To Array's End
     * 
     * @param indexFrom Array's First Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void shellSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * Calls Shell Sort From Zero To Index
     * 
     * @param indexTo Array's Last Index To Be Sorted
     * 
     * @throws OutOfBoundException 
     * 
     */
    public void shellSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Merge Sort Parallel
    //################################################################  

    /**
     * 
     */
    public void mergeParallelSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void mergeParallelSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void mergeParallelSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void mergeParallelSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Merge Sort Hybrid Parallel
    //################################################################  

    /**
     * 
     */
    public void mergeSortHybridParallel();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void mergeSortHybridParallel(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void mergeSortHybridParallelFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void mergeSortHybridParallelTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Quick Sort
    //################################################################  

    /**
     * 
     */
    public void quickSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void quickSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void quickSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void quickSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Quick Hybrid Sort
    //################################################################  

    /**
     * 
     */
    public void quickHybridSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void quickHybridSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void quickHybridSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void quickHybridSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Quick Parallel Sort
    //################################################################  

    /**
     * 
     */
    public void quickParallelSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void quickParallelSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void quickParallelSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void quickParallelSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Quick Parallel Hybrid Sort
    //################################################################  

    /**
     * 
     */
    public void quickParallelSortHybrid();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void quickParallelSortHybrid(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void quickParallelSortHybridFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void quickParallelSortHybridTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Tree Sort
    //################################################################  

    /**
     * 
     */
    public void treeSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void treeSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void treeSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void treeSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Counting Sort
    //################################################################  

    /**
     * 
     */
    public void countingSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void countingSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void countingSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void countingSortTo(int indexTo) throws OutOfBoundException;

    //#################################################################
    //  Intro Sort
    //################################################################  

    /**
     * 
     */
    public void introSort();

    /**
     * 
     * @param leftBound
     * @param rightBound
     * @throws OutOfBoundException
     */
    public void introSort(int leftBound, int rightBound) throws OutOfBoundException;

    /**
     * 
     * @param indexFrom
     * @throws OutOfBoundException
     */
    public void introSortFrom(int indexFrom) throws OutOfBoundException;

    /**
     * 
     * @param indexTo
     * @throws OutOfBoundException
     */
    public void introSortTo(int indexTo) throws OutOfBoundException;

    // TODO
    /*
     * 
     * mergeParallelSort - OK
     * mergeParallelSortHybrid - OK
     * quickSort - OK
     * quickSortHybrid - OK 
     * quickParallelSort - OK
     * quickParallelSortHybrid - OK
     * treeSort - OK
     * countingSort - OK
     * introSort - OK
     * smoothSort 
     * 
     */

}
