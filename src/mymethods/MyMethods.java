package mymethods;

import java.text.DecimalFormat;

public class MyMethods
{
    public static double sphereVolume(double radius)
    {
        return 4/3.0 * Math.PI * Math.pow(radius, 3);
    }
    public static double sphereArea(double radius)
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
