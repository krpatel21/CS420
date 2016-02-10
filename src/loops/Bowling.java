package loops;

import javax.swing.*;
import java.text.DecimalFormat;

public class Bowling
{
    public static void main(String[] args)
    {
        int game = 0;
        int pins = 0;
        int nbrGames = 0;
        double avg;

        String userEntry;
        String result;

        DecimalFormat round = new DecimalFormat("0.00");

        while (game != -1)
        {
            userEntry = JOptionPane.showInputDialog("Enter the score of game #" + (nbrGames + 1) + ". Enter -1 to exit.");
            game = Integer.parseInt(userEntry);
            if (game != -1)
            {
                pins += game;
                nbrGames++;
            }
        }
        avg = (double) pins / nbrGames;
        avg = Math.round(avg * 100.0) / 100.0;

        result = "Total pins = " + pins + "\n\n" +
            "Average = "+ round.format(avg);

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
