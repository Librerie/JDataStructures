package it.reexon.jdatastructures.structures;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Stack<T>
{
    private ArrayList<T> stack;

    /**
     * Constructor With An ArrayList As Parameter
     * @param S ArrayList To Use As stack
     */
    public Stack(ArrayList<T> S)
    {
        this.stack = new ArrayList<T>();
        for (int i = 0; i < S.size(); i++)
        {
            this.pushStack(S.get(i));
        }
    }

    /**
     * Constructor With An Array As Parameter
     * @param S Array To Use As stack
     */
    public Stack(T[] S)
    {
        this.stack = new ArrayList<T>();
        for (int i = 0; i < S.length; i++)
        {
            this.pushStack(S[i]);
        }
    }

    /**
     * Constructor That Create A New ArrayList To Be Used As stack
     */
    public Stack()
    {
        this(new ArrayList<T>());
    }

    /**
     * Add An Item To The stack (Inserted At Top Level)
     * @param element Element To Add To The stack
     */
    public void pushStack(T element)
    {
        if (this.stack != null)
        {
            this.stack.add(this.stack.size(), element);
        }
    }

    /**
     * Remove The First Element Of The stack
     * @return The Removed Item, Null If Empty
     */
    public T popStack()
    {
        if (!this.emptyStack())
        {
            return this.stack.remove(this.stack.size() - 1);
        }
        else
        {
            return null;
        }
    }

    /**
     * Return A Copy Of The First Item Of The stack
     * @return First Item, Null If Empty
     */
    public T topStack()
    {
        if (!this.emptyStack())
        {
            return this.stack.get(this.stack.size());
        }
        else
        {
            return null;
        }
    }

    /**
     * Verify If The stack Is Empty
     * @return True If The stack Is Empty, False Otherwise
     */
    public boolean emptyStack()
    {
        if (this.stack.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Create An Array With The Elements Of The stack
     * @return The Array
     */
    @SuppressWarnings("unchecked")
    public T[] toArray()
    {
        //T[] arr = (T[]) this.Stack.toArray();
        //(T[]) list.toArray( (T[])Array.newInstance (one.getClass(), list.size()) );
        T[] arr = this.stack.toArray((T[]) Array.newInstance(this.stack.get(0).getClass(), this.stack.size()));
        return arr;
    }

    /**
     *  Clone The Current stack Returning A Copy
     *  @return A New stack 
     */
    public ArrayList<T> clone()
    {
        return (this.stack);
    }

    /**
     *  Empty The stack
     */
    public void clear()
    {
        this.stack.clear();
    }

    /**
     *  Implements The hashCode Method For A stack
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stack == null) ? 0 : stack.hashCode());
        return result;
    }

    /**
     *  Implements The equals Method For A stack
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!(obj instanceof Stack))
            return false;
        @SuppressWarnings("unchecked")
        Stack<T> other = (Stack<T>) obj;
        if (stack == null)
        {
            if (other.stack != null)
                return false;
        }
        else if (!stack.equals(other.stack))
            return false;
        return true;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "stack [stack=" + stack + "]";
    }
}
