package testmymethods;

import mymethods.MyMethods;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestMoPmt
{
    public static void main(String[] args)
    {
        DecimalFormat round = new DecimalFormat("0.00");

        String userEntry;
        String result;

        double loanAmount;
        double apr;
        int years;
        double payment;

        userEntry = JOptionPane.showInputDialog("Enter loan amount.");
        loanAmount = Double.parseDouble(userEntry);

        userEntry = JOptionPane.showInputDialog("Enter APR as a decimal.");
        apr = Double.parseDouble(userEntry);

        userEntry = JOptionPane.showInputDialog("Enter number of years.");
        years = Integer.parseInt(userEntry);

        payment = MyMethods.moPmt(loanAmount, apr, years);

        result = "Loan Amount = $" + round.format(loanAmount);
        result += "\nAPR = " + (apr);
        result += "\nYears - " + round.format(years);
        result += "\nMonthly Payment =  " + round.format(payment);

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
