package myclasses;

public class Currency
{
    private int dollars;
    private int cents;

    //no arg constructor
    public Currency()
    {
        dollars = 0;
        cents = 0;
    }

    public Currency(int dollars, int cents)
    {
        this.dollars = dollars;
        setCents(cents);
    }

    public int getDollars()
    {
        return dollars;
    }

    public void setDollars(int dollars)
    {
        this.dollars = dollars;
    }

    public int getCents()
    {
        return cents;
    }

    public void setCents(int cents)
    {
        if (cents <=99 )
            this.cents = cents;
        else
        {
            dollars += cents / 100;
            this.cents = cents % 100;
        }
    }

    public void setAmounts(int newDollars, int newCents)
    {
        setDollars(newDollars);
        setCents(newCents);
    }

    public void add(int dollars, int cents)
    {
        this.dollars +=dollars;
        if (cents <=99 )
            this.cents += cents;
        else
        {
            this.dollars += cents / 100;
            this.cents += cents % 100;
        }
    }

    public boolean isZero()
    {
        return dollars == 0 & cents == 0;
    }

    @Override
    public String toString()
    {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
