package myclasses;

public abstract class BankAcct
{
    private int acctNbr;
    private double balance;

    public int getAcctNbr()
    {
        return acctNbr;
    }

    public void setAcctNbr(int acctNbr)
    {
        this.acctNbr = acctNbr;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public BankAcct(int acctNbr, double balance)
    {
        this.acctNbr = acctNbr;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public abstract void monthEnd();

    @Override
    public String toString()
    {
        return "Acct nbr " +  acctNbr + "has balance $"+ balance;
    }
}
