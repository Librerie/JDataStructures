/**
 * 
 */
package it.reexon.jdatastructures.exceptions;

/**
 * @author marco.velluto
 */
public class NotImplementException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public NotImplementException()
    {
        super();
    }

    public NotImplementException(String arg0)
    {
        super(arg0);
    }

    public NotImplementException(Throwable arg0)
    {
        super(arg0);
    }

    public NotImplementException(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }
}
