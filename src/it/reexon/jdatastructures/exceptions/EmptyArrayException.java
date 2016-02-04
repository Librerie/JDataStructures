/**
 * 
 */
package it.reexon.jdatastructures.exceptions;

/**
 * @author marco.velluto
 */
public class EmptyArrayException extends Exception
{
    private static final long serialVersionUID = 1L;

    public EmptyArrayException()
    {
        super();
    }

    public EmptyArrayException(String arg0)
    {
        super(arg0);
    }

    public EmptyArrayException(Throwable arg0)
    {
        super(arg0);
    }

    public EmptyArrayException(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }
}
