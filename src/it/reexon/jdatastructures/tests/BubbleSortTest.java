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
import it.reexon.jdatastructures.sorts.SortArray;


/**
 * @author marco.velluto
 *
 */
public class BubbleSortTest extends GeneralTest
{
    private static final Logger logger = LogManager.getLogger(BubbleSortTest.class);

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
     * test method for {@link it.reexon.jdatastructures.sorts.BubbleSort#BubbleSort(T[], int, int)}.
     */
    @Test
    public final void testBubbleSort()
    {
        testBubbleSortInteger();
        testBubbleSortDouble();
    }

    private void testBubbleSortDouble()
    {
        long startTime = System.nanoTime();

        Boolean isSorted = false;
        try
        {
            SortArray<Double> sort = new SortArray<Double>(super.arrDouble.clone());
            logger.debug("*** BubbleSort ");
            logger.debug("*** Lenght = " + super.arrDouble.length);
            sort.bubbleSort();
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

        long duration = super.durationSeconds(startTime);
        System.out.println("*** BubbleSort - passed: " + isSorted + " time: " + duration + " ms");
    }

    private void testBubbleSortInteger()
    {
        long startTime = System.nanoTime();

        Boolean isSorted = false;
        try
        {
            SortArray<Integer> sort = new SortArray<Integer>(super.arrInteger.clone());
            logger.debug("*** BubbleSort ");
            logger.debug("*** Lenght = " + super.arrInteger.length);
            sort.bubbleSort();
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

        long duration = super.durationSeconds(startTime);
        System.out.println("*** BubbleSort - passed: " + isSorted + " time: " + duration + " ms");
    }
}
