package testmyclasses;

import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;
import myclasses.Ladder;

import java.util.Scanner;

public class TestLadder
{
    public static void main(String[] args) {

        Ladder l = new Ladder();
        System.out.println("Step (U)p, Step (D)own, or (Q)uit?");
        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();

        while (!selection.equalsIgnoreCase("q"))
        {
            if (selection.equalsIgnoreCase("u"))
            {
                try
                {
                    l.stepUp();
                }
                catch (TopOfLadderException e)
                {
                    System.err.println(e);
                }
                System.out.println(l);
                System.out.println("Step (U)p, Step (D)own, or (Q)uit?");
                selection = input.nextLine();
            }

            else if (selection.equalsIgnoreCase("d"))
            {
                try
                {
                    l.stepDown();
                }
                catch (BottomOfLadderException e)
                {
                    System.err.println(e);
                }
                System.out.println(l);
                System.out.println("Step (U)p, Step (D)own, or (Q)uit?");
                selection = input.nextLine();
            }
            else if (selection.equalsIgnoreCase("q"))
            {
                System.out.println("Good bye");
            }
            else
            {
                System.out.println("Bad Entry. Try Again");
                System.out.println(l);
                System.out.println("Step (U)p, Step (D)own, or (Q)uit?");
                selection = input.nextLine();
            }
        }
        System.out.println("Good bye");
    }
}
