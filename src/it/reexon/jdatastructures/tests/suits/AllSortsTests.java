package it.reexon.jdatastructures.tests.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import it.reexon.jdatastructures.tests.structures.HeapTest;
import it.reexon.jdatastructures.tests.structures.MaxHeapTest;
import it.reexon.jdatastructures.tests.structures.MinHeapTest;
import it.reexon.jdatastructures.tests.structures.QueueTest;
import it.reexon.jdatastructures.tests.structures.ResearchTreeTest;
import it.reexon.jdatastructures.tests.structures.StackTest;
import it.reexon.jdatastructures.tests.structures.TreeTest;

@RunWith(Suite.class)
@SuiteClasses({ HeapTest.class, MaxHeapTest.class, MinHeapTest.class, QueueTest.class, ResearchTreeTest.class, StackTest.class, TreeTest.class })
public class AllSortsTests
{

}
