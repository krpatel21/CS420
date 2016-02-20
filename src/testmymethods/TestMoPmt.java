//Kaushal Patel cs420 Spring 2016
package testmymethods;

import mymethods.MyMethods;
import java.text.DecimalFormat;

public class TestMoPmt
{
    public static void main(String[] args)
    {
        DecimalFormat round = new DecimalFormat("0.00");

        double loanAmount = 82900;
        double apr = 0.095;
        int years = 15;
        double payment;

        String result;

        payment = MyMethods.moPmt(loanAmount, apr, years);

        result = "Loan Amount = $" + round.format(loanAmount);
        result += "\nAPR = " + (apr);
        result += "\nYears = " + (years);
        result += "\nMonthly Payment =  $" + round.format(payment);

        System.out.println(result);

        System.exit(0);
    }
}
