package myclasses;

import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;

public class Ladder
{
    private int topRung;
    private int currentRung;

    public Ladder()
    {
        topRung = 4;
        currentRung = 0;
    }

    public void stepUp() throws TopOfLadderException
    {
        if (currentRung == topRung){
            throw new TopOfLadderException();
        }
        else
        {
            currentRung++;
        }
    }

    public void stepDown() throws BottomOfLadderException
    {
        if (currentRung == 0)
        {
            throw new BottomOfLadderException();
        }
        else
        {
            currentRung--;
        }
    }

    @Override
    public String toString() {
        return "You are on rung " + currentRung + ".";
    }
}
