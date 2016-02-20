package mymethods;

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

    public static double moPmt(double loanAmount, double apr, int years)
    {
        apr = apr / 12.0;
        int n = years * 12;
        return loanAmount * (apr + (apr / ( Math.pow(1 + apr, n) - 1) ) );
    }
}
