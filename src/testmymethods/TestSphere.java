package testmymethods;

import mymethods.MyMethods;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestSphere
{
    public static void main(String[] args)
    {
        DecimalFormat round = new DecimalFormat("0.00");

        String userEntry;
        String result;

        double radius;
        double volume;
        double area;

        userEntry = JOptionPane.showInputDialog("Enter radius.");
        radius = Double.parseDouble(userEntry);

        volume = MyMethods.sphereVolume(radius);
        area = MyMethods.sphereArea(radius);

        result= "The given radius is " + radius;
        result+= "\nThe volume of the sphere is " + round.format(volume);
        result+= "\nThe area of the sphere is " + round.format(area);

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
