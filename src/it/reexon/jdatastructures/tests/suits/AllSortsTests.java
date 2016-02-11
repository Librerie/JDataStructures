package it.reexon.jdatastructures.tests.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import it.reexon.jdatastructures.tests.sorts.BubbleSortTest;
import it.reexon.jdatastructures.tests.sorts.HeapSortTest;
import it.reexon.jdatastructures.tests.sorts.InsertionSortTest;
import it.reexon.jdatastructures.tests.sorts.MergeHybridSortTest;
import it.reexon.jdatastructures.tests.sorts.MergeSortTest;
import it.reexon.jdatastructures.tests.sorts.SelectionSortTest;
import it.reexon.jdatastructures.tests.sorts.ShellSortTest;
import it.reexon.jdatastructures.tests.sorts.SortArrayTest;

@RunWith(Suite.class)
@SuiteClasses({ BubbleSortTest.class, HeapSortTest.class, InsertionSortTest.class, MergeHybridSortTest.class, MergeSortTest.class,
        SelectionSortTest.class, ShellSortTest.class, SortArrayTest.class })
public class AllSortsTests
{

}
