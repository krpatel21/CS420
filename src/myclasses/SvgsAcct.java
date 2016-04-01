package myclasses;

public class SvgsAcct extends BankAcct
{
    private static double interestRate = 0.04;

    public SvgsAcct(int acctNbr, double balance)
    {
        super(acctNbr, balance);
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public static void setInterestRate(double interestRate)
    {
        SvgsAcct.interestRate = interestRate;
    }

    @Override
    public void monthEnd()
    {
        double interest = this.getBalance() * interestRate / 12.0;
        this.setBalance(this.getBalance() + interest);
    }
}
