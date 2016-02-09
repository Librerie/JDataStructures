/**
 * 
 */
package it.reexon.jdatastructures.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.reexon.jdatastructures.exceptions.EmptyArrayException;
import it.reexon.jdatastructures.exceptions.OutOfBoundException;
import it.reexon.jdatastructures.objects.SortArray;


/**
 * @author marco.velluto
 *
 */
public class SortArrayTest extends GeneralTest
{
    private static final Logger logger = LogManager.getLogger(MergeSortTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {}

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {}

    @Before
    public void setUp() throws Exception
    {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#SortArray(T[])}.
     */
    @Test
    public final void testSortArrayTArray()
    {
        long startTime = System.nanoTime();

        Boolean isSorted = false;
        try
        {
            SortArray<Integer> sort = new SortArray<Integer>(super.arrInteger.clone());
            logger.debug("*** SelectionsSort ");
            logger.debug("*** Lenght = " + super.arrInteger.length);
            sort.shellSort();
            isSorted = sort.isSorted();
            logger.debug("Sorted: " + isSorted);
        }
        catch (EmptyArrayException e)
        {
            fail("Error: " + e);
        }
        catch (OutOfBoundException e)
        {
            fail("Error: " + e);
        }
        assertTrue(isSorted);

        long duration = super.durationMilliseconds(startTime);
        System.out.println("*** MergeSort - passed: " + isSorted + " time: " + duration + " ms");
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#SortArray(java.util.ArrayList)}.
     */
    @Test
    public final void testSortArrayArrayListOfT()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#isSorted()}.
     */
    @Test
    public final void testIsSorted()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#printArray()}.
     */
    @Test
    public final void testPrintArray()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#getArray()}.
     */
    @Test
    public final void testGetArray()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#getArrayList()}.
     */
    @Test
    public final void testGetArrayList()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#insertionSort(int, int)}.
     */
    @Test
    public final void testInsertionSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#insertionSort()}.
     */
    @Test
    public final void testInsertionSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#insertionSortFrom(int)}.
     */
    @Test
    public final void testInsertionSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#insertionSortTo(int)}.
     */
    @Test
    public final void testInsertionSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#selectionSort(int, int)}.
     */
    @Test
    public final void testSelectionSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#selectionSort()}.
     */
    @Test
    public final void testSelectionSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#selectionSortFrom(int)}.
     */
    @Test
    public final void testSelectionSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#selectionSortTo(int)}.
     */
    @Test
    public final void testSelectionSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#bubbleSort(int, int)}.
     */
    @Test
    public final void testBubbleSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#bubbleSort()}.
     */
    @Test
    public final void testBubbleSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#bubbleSortFrom(int)}.
     */
    @Test
    public final void testBubbleSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#bubbleSortTo(int)}.
     */
    @Test
    public final void testBubbleSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#shellSort(int, int)}.
     */
    @Test
    public final void testShellSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#shellSort()}.
     */
    @Test
    public final void testShellSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#shellSortFrom(int)}.
     */
    @Test
    public final void testShellSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#shellSortTo(int)}.
     */
    @Test
    public final void testShellSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeSort(int, int)}.
     */
    @Test
    public final void testMergeSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeSort()}.
     */
    @Test
    public final void testMergeSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeSortFrom(int)}.
     */
    @Test
    public final void testMergeSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeSortTo(int)}.
     */
    @Test
    public final void testMergeSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeHybridSort(int, int)}.
     */
    @Test
    public final void testMergeHybridSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeHybridSort()}.
     */
    @Test
    public final void testMergeHybridSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeHybridSortFrom(int)}.
     */
    @Test
    public final void testMergeHybridSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#mergeHybridSortTo(int)}.
     */
    @Test
    public final void testMergeHybridSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#heapSort(int, int)}.
     */
    @Test
    public final void testHeapSortIntInt()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#heapSort()}.
     */
    @Test
    public final void testHeapSort()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#heapSortFrom(int)}.
     */
    @Test
    public final void testHeapSortFrom()
    {
        fail("Not yet implemented"); // TODO
    }

    /**
     * SortsTest method for {@link it.reexon.jdatastructures.objects.SortArray#heapSortTo(int)}.
     */
    @Test
    public final void testHeapSortTo()
    {
        fail("Not yet implemented"); // TODO
    }

}
