/**
 * 
 */
package it.reexon.jdatastructures.exceptions;

/**
 * @author marco.velluto
 */
public class EmptyHeapException extends Exception
{
    private static final long serialVersionUID = 1L;

    public EmptyHeapException()
    {
        super();
    }

    public EmptyHeapException(String message)
    {
        super(message);
    }

    public EmptyHeapException(Throwable cause)
    {
        super(cause);
    }

    public EmptyHeapException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EmptyHeapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
