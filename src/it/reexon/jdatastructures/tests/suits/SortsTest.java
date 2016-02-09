/**
 * 
 */
package it.reexon.jdatastructures.tests.suits;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import it.reexon.jdatastructures.tests.BubbleSortTest;
import it.reexon.jdatastructures.tests.HeapSortTest;
import it.reexon.jdatastructures.tests.InsertionSortTest;
import it.reexon.jdatastructures.tests.MergeHybridSortTest;
import it.reexon.jdatastructures.tests.MergeSortTest;
import it.reexon.jdatastructures.tests.SelectionSortTest;
import it.reexon.jdatastructures.tests.ShellSortTest;


/**
 * @author marco.velluto
 *
 */

@RunWith(Suite.class)
@SuiteClasses({
    BubbleSortTest.class,
    HeapSortTest.class,
    InsertionSortTest.class,
    MergeHybridSortTest.class,
    MergeSortTest.class,
    SelectionSortTest.class,
    ShellSortTest.class
})
public class SortsTest
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

    @org.junit.Test
    public final void test()
    {
        assertTrue(true);
    }
}
