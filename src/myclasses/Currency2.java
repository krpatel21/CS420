package myclasses;

public class Currency2
{
    private int amount;

    //no arg constructor
    public Currency2()
    {
        amount = 0;
    }

    public Currency2(int amount)
    {
        this.amount = amount;
    }

    public int getDollars()
    {
        return amount / 100;
    }

    public void setDollars(int dollars)
    {
        amount += dollars * 100;
    }

    public int getCents()
    {
        return amount % 100;
    }

    public void setCents(int cents)
    {
        amount += cents;
    }

    public void setAmounts(int newDollars, int newCents)
    {
        setDollars(newDollars);
        setCents(newCents);
    }

    public void add(int dollars, int cents)
    {
        amount += dollars * 100;
        amount += cents;
    }

    public boolean isZero()
    {
        return amount == 0;
    }

    @Override
    public String toString()
    {
        return "$" + getDollars() + "." + (getCents() < 10 ? "0" + getCents() : getCents());
    }
}
