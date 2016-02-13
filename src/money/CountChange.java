//Kaushal Patel cs420 Spring 2016
package money;

import javax.swing.*;
import java.text.DecimalFormat;

public class CountChange
{
    public static void main(String[] args)
    {
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.10;
        final double NICKEL_VALUE = 0.05;
        final double PENNY_VALUE = 0.01;
        double totalVal;

        int quarters;
        int dimes;
        int nickels;
        int pennies;

        String userEntry;
        String result;

        DecimalFormat round = new DecimalFormat("0.00");

        userEntry = JOptionPane.showInputDialog("How many quarters?");
        quarters = Integer.parseInt(userEntry);

        userEntry = JOptionPane.showInputDialog("How many dimes?");
        dimes = Integer.parseInt(userEntry);

        userEntry = JOptionPane.showInputDialog("How many nickels?");
        nickels = Integer.parseInt(userEntry);

        userEntry = JOptionPane.showInputDialog("How many pennies?");
        pennies = Integer.parseInt(userEntry);

        totalVal = QUARTER_VALUE * quarters + DIME_VALUE * dimes + NICKEL_VALUE* nickels + PENNY_VALUE *pennies;

        result = "The total value of " +
                quarters + (quarters != 1 ? " quarters, " : " quarter, ") +
                dimes + (dimes != 1 ? " dimes, " : " dime, ") +
                nickels + (nickels != 1 ? " nickels, " : " nickel, ") + "and"+
                pennies + (pennies != 1 ? " pennies. " : " penny ")+
                "is $" + round.format(totalVal);

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
