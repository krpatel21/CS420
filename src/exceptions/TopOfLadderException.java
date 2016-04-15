package exceptions;

public class TopOfLadderException extends Exception
{
    public TopOfLadderException()
    {
        super("You are already at the top.");
    }
}
