package it.reexon.jdatastructures.tests.structures;

import java.util.ArrayList;

import it.reexon.jdatastructures.ParallelRandInt;
import it.reexon.jdatastructures.exceptions.EmptyHeapException;
import it.reexon.jdatastructures.structures.MaxHeap;
import it.reexon.jdatastructures.structures.MinHeap;
import it.reexon.jdatastructures.structures.Queue;
import it.reexon.jdatastructures.structures.Stack;


@Deprecated
public class TestStructures
{
    public static void main(String[] args)
    {
        boolean TEST_QUEUE = false;
        boolean TEST_STACK = false;
        boolean TEST_HEAP_MAX = false;
        boolean TEST_HEAP_MIN = false;
        int LENGHT = 100;
        int RANGE = 100;
        // ################################################################
        //		Random Array Creation
        // ################################################################
        ParallelRandInt rand = new ParallelRandInt(LENGHT, RANGE);
        Integer[] Arr = rand.getRandIntArr();
        ArrayList<Integer> ArrList = rand.getRandIntArrList();
        // ################################################################
        //		Queue test
        // ################################################################		
        if (TEST_QUEUE)
        {
            System.out.println("################################################################\n");
            System.out.println("Queue test: \n");
            System.out.println("With Array");
            Queue<Integer> q = new Queue<Integer>(Arr);
            System.out.println(q.toString());
            System.out.println("Empty: " + q.emptyQueue());
            q.enQueue(10);
            System.out.println(q.toString());
            q.deQueue();
            System.out.println(q.toString());
            q.clear();
            System.out.println("Empty: " + q.emptyQueue());
            System.out.println("\n\nWith ArrayList");
            q = new Queue<Integer>(ArrList);
            System.out.println(q.toString());
            System.out.println("Empty: " + q.emptyQueue());
            q.enQueue(10);
            System.out.println(q.toString());
            q.deQueue();
            System.out.println(q.toString());
            q.clear();
            System.out.println("Empty: " + q.emptyQueue());
        }
        // ################################################################
        //		Stack test
        // ################################################################		
        if (TEST_STACK)
        {
            System.out.println("################################################################\n");
            System.out.println("Stack test: \n");
            System.out.println("With Array");
            Stack<Integer> s = new Stack<Integer>(Arr);
            System.out.println(s.toString());
            System.out.println("Empty: " + s.emptyStack());
            s.pushStack(10);
            System.out.println(s.toString());
            s.popStack();
            System.out.println(s.toString());
            s.clear();
            System.out.println("Empty: " + s.emptyStack());
            System.out.println("\n\nWith ArrayList");
            s = new Stack<Integer>(ArrList);
            System.out.println(s.toString());
            System.out.println("Empty: " + s.emptyStack());
            s.pushStack(10);
            System.out.println(s.toString());
            s.popStack();
            System.out.println(s.toString());
            s.clear();
            System.out.println("Empty: " + s.emptyStack());
        }
        // ################################################################
        //		Min AbstractHeap test
        // ################################################################		
        if (TEST_HEAP_MIN)
        {
            System.out.println("################################################################\n");
            System.out.println("Min AbstractHeap test: \n");
            System.out.println("With Array");
            MinHeap<Integer> minH = new MinHeap<Integer>(ArrList);
            System.out.println(minH.toString());
            minH.insert(35);
            System.out.println(minH.toString());
            try
            {
                minH.extractMinValue();
            }
            catch (EmptyHeapException e)
            {
                e.printStackTrace();
            }
            System.out.println(minH.toString());
            System.out.println("\nWith ArrayList");
            MinHeap<Integer> minlH = new MinHeap<Integer>(Arr);
            System.out.println(minlH.toString());
            minlH.insert(35);
            System.out.println(minlH.toString());
            try
            {
                minlH.extractMinValue();
            }
            catch (EmptyHeapException e)
            {
                e.printStackTrace();
            }
            System.out.println(minlH.toString());
        }
        // ################################################################
        //		Max AbstractHeap test
        // ################################################################		
        if (TEST_HEAP_MAX)
        {
            System.out.println("################################################################\n");
            System.out.println("Max AbstractHeap test: \n");
            System.out.println("With Array");
            MaxHeap<Integer> maxH = new MaxHeap<Integer>(ArrList);
            System.out.println(maxH.toString());
            maxH.insert(35);
            System.out.println(maxH.toString());
            try
            {
                maxH.extractMaxValue();
            }
            catch (EmptyHeapException e)
            {
                e.printStackTrace();
            }
            System.out.println(maxH.toString());
            System.out.println("\nWith ArrayList");
            MaxHeap<Integer> maxlH = new MaxHeap<Integer>(Arr);
            System.out.println(maxlH.toString());
            maxlH.insert(35);
            System.out.println(maxlH.toString());
            try
            {
                maxlH.extractMaxValue();
            }
            catch (EmptyHeapException e)
            {
                e.printStackTrace();
            }
            System.out.println(maxlH.toString());
        }
    }
}
