/**
 * 
 */
package it.reexon.jdatastructures.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.reexon.jdatastructures.ParallelRandInt;
import it.reexon.jdatastructures.exceptions.EmptyArrayException;
import it.reexon.jdatastructures.exceptions.OutOfBoundException;
import it.reexon.jdatastructures.sorts.SortArray;


/**
 * @author marco.velluto
 *
 */
public class BubbleSortTest extends GeneralTest
{

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {}

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {}

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {}

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {}

    /**
     * Test method for {@link it.reexon.jdatastructures.sorts.BubbleSort#BubbleSort(T[], int, int)}.
     */
    @Test
    public final void testBubbleSort()
    {
        ParallelRandInt rand = new ParallelRandInt(super.seed, super.lenght, super.range);
        Integer[] arr = rand.getRandIntArr();
        Boolean isSorted = false;
        try
        {
            SortArray<Integer> sort = new SortArray<Integer>(arr.clone());
            System.out.print("\n"); //TODO: Change with Log4j
            sort = new SortArray<Integer>(arr.clone());
            System.out.println("*** BubbleSort ");
            System.out.println("*** Lenght = " + arr.length);
            sort.bubbleSort();
            isSorted = sort.isSorted();
            System.out.println("Sorted: " + isSorted);
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
    }

    /**
     * Test method for {@link it.reexon.jdatastructures.sorts.BubbleSort#getArraySort()}.
     */
    @Test
    public final void testGetArraySort()
    {
        fail("Not yet implemented"); // TODO
    }

}
