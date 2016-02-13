package money;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TotalDue
{
    public static void main(String[] args)
    {
        int quantitySold;
        double priceEach, discountRate, discountAmount, totalDueBefore, totalDueAfter;

        String userEntry;
        String result;

        DecimalFormat money = new DecimalFormat("0.00");

        userEntry = JOptionPane.showInputDialog("Enter quantity sold.");
        quantitySold = Integer.parseInt(userEntry);

        userEntry = JOptionPane.showInputDialog("Enter price each.");
        priceEach = Double.parseDouble(userEntry);

        userEntry = JOptionPane.showInputDialog("Enter discount rate as a decimal.");
        discountRate = Double.parseDouble(userEntry);

        totalDueBefore = priceEach * quantitySold;
        discountAmount = totalDueBefore * discountRate;
        totalDueAfter = totalDueBefore - discountAmount;

        result = "Total due before discount is $" + money.format(totalDueBefore) + "\n" + "Discount Amount is $"
                + money.format(discountAmount) + "\n" + "Total due after discount is $" + money.format(totalDueAfter)
                + "**";

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
