//Kaushal Patel cs420 Spring 2016
package loops;

import javax.swing.*;
import java.text.DecimalFormat;

public class Statistics
{
    static String userEntry = "";
    static String result = "";
    static int counter = 0;
    static int i = 0;
    static int value;
    static int max = 0;
    static int min = 0;
    static int sum = 0;
    static double mean;
    static String observation = "";
    static DecimalFormat round = new DecimalFormat("0.00");

    public static void main(String[] args)
    {
        while (!userEntry.equalsIgnoreCase("end"))
        {
            userEntry = JOptionPane.showInputDialog("Enter observation #" + (counter + 1) + "( or \"end\" to quit)");
            if (userEntry.equalsIgnoreCase("end"))
            {
                displayResult();
            }
            else
            {
                value = Integer.parseInt(userEntry);
                if (i == 0)
                {
                    max = value;
                    min = value;
                }
                else
                {
                    max = (value > max) ? value : max;
                    min = (value < min) ? value : min;
                }
                sum += value;
                observation += "\n" + value;
                counter++;
                i = value;
            }
            mean = (double) sum / counter;
        }
        System.exit(0);
    }

    private static void displayResult()
    {
        if (counter == 0)
        {
            result = "No observations entered";
        }
        else
        {
            result = "You entered " + counter + (counter == 1 ? " observation." : " observations.");
            result += "\nThe minimum is " + min + ".";
            result += "\nThe maximum is " + max + ".";
            result += "\nThe sum is " + sum + ".";
            result += "\nThe mean is " + round.format(mean) + ".";
            result += "\n***********";
            result += "\nYou entered the following" +(counter == 1 ? " observation:" : " observations:");
            result += observation;
        }
        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
    }
}
