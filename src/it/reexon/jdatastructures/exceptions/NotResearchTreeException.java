package it.reexon.jdatastructures.exceptions;

/**
 * @author marco.velluto
 */
public class NotResearchTreeException extends Exception
{
    private static final long serialVersionUID = 1L;

    public NotResearchTreeException()
    {
        super();
    }

    public NotResearchTreeException(String message)
    {
        super(message);
    }

    public NotResearchTreeException(Throwable err)
    {
        super(err);
    }

    public NotResearchTreeException(String err, Throwable message)
    {
        super(err, message);
    }
}
