/**
 * 
 */
package it.reexon.jdatastructures.tests.sorts;

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
import it.reexon.jdatastructures.tests.GeneralTest;


/**
 * @author marco.velluto
 *
 */
public class ShellSortTest extends GeneralTest
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
     * SortsTest method for {@link it.reexon.jdatastructures.sorts.ShellSort#ShellSort(T[], int, int)}.
     */
    @Test
    public final void testShellSort()
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

}
