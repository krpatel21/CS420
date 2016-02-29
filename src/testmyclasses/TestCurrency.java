package testmyclasses;

import myclasses.Currency;

public class TestCurrency
{
    public static void main(String[] args)
    {
        Currency c = new Currency(8, 205);
        System.out.println(c);

        c.add(1,200);
        System.out.println(c);

        Currency c2 = new Currency();
        System.out.println(c2.isZero());
    }
}
