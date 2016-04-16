package exceptions;

public class BottomOfLadderException extends Exception
{
    private static final long serialVersionUID = 1L;

    public BottomOfLadderException()
    {
        super("You are already at the bottom.");
    }
}
