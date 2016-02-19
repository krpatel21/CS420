//Kaushal Patel cs420 Spring 2016
package money;

import javax.swing.*;
import java.text.DecimalFormat;

public class MakeChange
{
    public static void main(String[] args)
    {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNY_VALUE = 1;
        double totalVal;
        int coin;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        String userEntry;
        String result;

        userEntry = JOptionPane.showInputDialog("Enter total value");
        totalVal = Double.parseDouble(userEntry);
        coin = (int) (totalVal * 100);

        quarters = coin / QUARTER_VALUE;
        coin = coin % QUARTER_VALUE;

        dimes = coin / DIME_VALUE;
        coin = coin % DIME_VALUE;

        nickels = coin / NICKEL_VALUE;
        coin = coin % NICKEL_VALUE;

        pennies = coin / PENNY_VALUE;

        DecimalFormat round = new DecimalFormat("0.00");

        result = "The correct change $" + round.format(totalVal) + " is " +
                quarters + (quarters != 1 ? " quarters, " : " quarter, ") +
                dimes + (dimes != 1 ? " dimes, " : " dime, ") +
                nickels + (nickels != 1 ? " nickels, " : " nickel, ") +
                pennies + (pennies != 1 ? " pennies. " : " penny. ");

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
