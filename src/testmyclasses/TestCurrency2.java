package testmyclasses;

import myclasses.Currency2;

public class TestCurrency2
{
    public static void main(String[] args)
    {
        Currency2 c = new Currency2(205);
        System.out.println(c);

        c.add(1,200);
        System.out.println(c);

        Currency2 c2 = new Currency2();
        System.out.println(c2.isZero());
    }
}
