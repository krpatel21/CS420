package exceptions;

public class BottomOfLadderException extends Exception
{
    public BottomOfLadderException()
    {
        super("You are already at the bottom.");
    }
}
