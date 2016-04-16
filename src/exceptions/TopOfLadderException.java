package exceptions;

public class TopOfLadderException extends Exception
{
    private static final long serialVersionUID = 1L;

    public TopOfLadderException()
    {
        super("You are already at the top.");
    }
}
