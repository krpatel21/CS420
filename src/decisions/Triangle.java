//Kaushal Patel cs420 Spring 2016
package decisions;

import javax.swing.*;

public class Triangle
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String userEntry;
        String result;
        String triangle;
        boolean isTriangle;


        userEntry = JOptionPane.showInputDialog("Enter first length.");
        int a = Integer.parseInt(userEntry);
        userEntry = JOptionPane.showInputDialog("Enter first length.");
        int b = Integer.parseInt(userEntry);
        userEntry = JOptionPane.showInputDialog("Enter first length.");
        int c = Integer.parseInt(userEntry);

        int num1 = a;
        int num2 = b;
        int num3 = c;

        if (a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c)
        {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        isTriangle = a + b > c;


        result = "You gave me: " + num1 + ", " + num2 + ", " + num3;
        result+= "\n\n";
        result+= "In order: "+ num1 + ", " + num2 + ", " + num3;
        result+= "\n\n";

        if (!isTriangle)
            result+= "You cannot make a triangle with these sides.";
        else if (a * a + b * b == c * c)
            result+= "You can make a right scalene triangle with these sides.";
        else if (a == b && a == c)
            result+= "You can make an equilateral triangle with these sides";
        else if (a != b && a != c && b != c)
            result+= "You can make a scalene triangle with these sides.";
        else
            result+= "You can make an isosceles triangle with these sides.";

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
