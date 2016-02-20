//Kaushal Patel cs420 Spring 2016
package testmymethods;

import mymethods.MyMethods;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestSphere
{
    public static void main(String[] args)
    {
        DecimalFormat round = new DecimalFormat("0.00");

        String result;

        double radius = 2.4;
        double volume;
        double area;

        volume = MyMethods.sphereVolume(radius);
        area = MyMethods.sphereArea(radius);

        result= "The given radius is " + radius;
        result+= "\nThe volume of the sphere is " + round.format(volume);
        result+= "\nThe area of the sphere is " + round.format(area);

        System.out.println(result);

        System.exit(0);
    }
}
