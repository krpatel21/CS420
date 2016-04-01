package myclasses;

public class ChkgAcct extends BankAcct
{
    private static double monthlyFee = 3.00;
    private static double perCheckFee = 0.15;
    private int nbrOfChecks = 0;

    public static double getPerCheckFee()
    {
        return perCheckFee;
    }

    public static void setPerCheckFee(double perCheckFee)
    {
        ChkgAcct.perCheckFee = perCheckFee;
    }

    public int getNbrOfChecks()
    {
        return nbrOfChecks;
    }

    public void setNbrOfChecks(int nbrOfChecks)
    {
        this.nbrOfChecks = nbrOfChecks;
    }

    public static double getMonthlyFee()
    {
        return monthlyFee;
    }

    public static void setMonthlyFee(double monthlyFee)
    {
        ChkgAcct.monthlyFee = monthlyFee;
    }

    public ChkgAcct(int acctNbr, double balance)
    {
        super(acctNbr, balance);
    }

    @Override
    public void monthEnd()
    {

    }
}
