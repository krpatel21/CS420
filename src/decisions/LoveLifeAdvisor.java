package decisions;

import javax.swing.*;

public class LoveLifeAdvisor
{
    static String result = "";
    static boolean legal;
    static int income;
    static int age;
    static int pAge;
    static String userEntry;

    public static void main(String[] args)
    {
        askAge();

        if (age < 16)
        {
            result = "you are not old enough";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else legal = age >= 18;

        askPAge();

        if (!legal && (pAge < 18 && pAge > 15))
        {
            result = "Ask out good luck";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else if (pAge < 18)
        {
            result = "have fun in prison";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else if (Math.abs(pAge - age) <= 20)
        {
            result = "Ask out good luck";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else if (!legal)
        {
            result = "Better luck next time";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        askIncome();

        if (income >= 200000)
        {
            result = "Ask out good luck";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        } else
        {
            result = "Better luck next time";
            JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        System.exit(0);
    }

    private static void askIncome()
    {
        userEntry = JOptionPane.showInputDialog("What is your prospective date's income");
        income = Integer.parseInt(userEntry);
    }

    private static void askPAge()
    {
        userEntry = JOptionPane.showInputDialog("How old is your prospective date?");
        pAge = Integer.parseInt(userEntry);
    }

    private static void askAge()
    {
        userEntry = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(userEntry);
    }
}
