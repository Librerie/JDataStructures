/**
 * 
 */
package it.reexon.jdatastructures.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import it.reexon.jdatastructures.ParallelRandDouble;
import it.reexon.jdatastructures.ParallelRandInt;


/**
 * @author marco.velluto
 *
 */
public abstract class GeneralTest
{
    protected final int seed = 1111;
    protected final int lenght = 1000;
    protected final int range = 100;

    protected ParallelRandInt rand = new ParallelRandInt(this.seed, this.lenght, this.range);
    protected Integer[] arrInteger = rand.getRandIntArr();

    protected Double[] arrDouble = new ParallelRandDouble(seed, lenght).getRandDoubleArr();

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
     * 
     * @param startTime
     * @param endTime
     * @return
     */
    public long durationNanoTime(long startTime, long endTime)
    {
        return endTime - startTime;
    }

    /**
     * 
     * @param startTime
     * @return
     */
    public long durationNanoTime(long startTime)
    {
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * 
     * @param startTime
     * @param endTime
     * @return
     */
    public long durationMilliseconds(long startTime, long endTime)
    {
        return this.durationNanoTime(startTime, endTime) / 1000000;
    }

    /**
     * 
     * @param startTime
     * @return
     */
    public long durationMilliseconds(long startTime)
    {
        return this.durationNanoTime(startTime, System.nanoTime()) / 1000000;
    }

    /**
     * 
     * @param startTime
     * @return
     */
    public long durationSeconds(long startTime)
    {
        return this.durationNanoTime(startTime, System.nanoTime()) / 1000000000;
    }

}
