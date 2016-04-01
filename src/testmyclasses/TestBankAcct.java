package testmyclasses;

import myclasses.ChkgAcct;
import myclasses.SvgsAcct;

public class TestBankAcct
{
    public static void main(String[] args)
    {
        SvgsAcct s = new SvgsAcct(111,300);
        ChkgAcct c = new ChkgAcct(222,500);
        ChkgAcct c2 = new ChkgAcct(333,600);

        System.out.println(s);
        System.out.println(c);
        System.out.println(c2);
        System.out.println();

        s.deposit(100);
        s.withdraw(250);
        c.deposit(150);
        c.withdraw(100);
        c.withdraw(200);
        c2.deposit(100);
        c2.deposit(150);
        c2.withdraw(50);

        s.monthEnd();
        c.monthEnd();
        c2.monthEnd();

        System.out.println("End of month 1:");
        System.out.println(s);
        System.out.println(c);
        System.out.println(c2);
        System.out.println();

        SvgsAcct.setInterestRate(0.05);
        ChkgAcct.setMonthlyFee(5);
        ChkgAcct.setPerCheckFee(0.18);

        s.deposit(750);
        s.withdraw(400);
        s.withdraw(50);
        s.withdraw(100);
        c.deposit(300);
        c.withdraw(50);
        c.withdraw(60);
        c.withdraw(70);
        c2.withdraw(10);

        s.monthEnd();
        c.monthEnd();
        c2.monthEnd();

        System.out.println("End of month 2:");
        System.out.println(s);
        System.out.println(c);
        System.out.println(c2);
        System.out.println();


    }
}
