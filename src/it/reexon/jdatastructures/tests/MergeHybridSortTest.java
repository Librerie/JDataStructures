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
public class MergeHybridSortTest extends GeneralTest
{
    private static final Logger logger = LogManager.getLogger(MergeHybridSortTest.class);

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
     * Test method for {@link it.reexon.jdatastructures.sorts.MergeHybridSort#MergeHybridSort(T[], int, int)}.
     */
    @Test
    public final void testMergeHybridSort()
    {
        long startTime = System.nanoTime();

        Boolean isSorted = false;
        try
        {
            SortArray<Integer> sort = new SortArray<Integer>(super.arr.clone());
            logger.debug("*** MergeHybridSort ");
            logger.debug("*** Lenght = " + super.arr.length);
            sort.mergeHybridSort();
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
        System.out.println("*** MergeHybridSort - passed: " + isSorted + " time: " + duration + " ms");
    }

}
