package myclasses;

public class Segment2 implements Cloneable
{
    Point2 p1;
    Point2 p2;

    public Segment2(Point2 p1, Point2 p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment2(int x1, int y1, int x2, int y2)
    {
        this.p1 = new Point2(x1, y1);
        this.p2 = new Point2(x2, y2);
    }

    public double length()
    {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        return Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }

    @Override
    public String toString()
    {
        return p1 +"-"+p2;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (!(o instanceof Segment2))
            return false;

        Segment2 s = (Segment2) o;

        return this.p1.equals(s.p1) &&
               this.p2.equals(s.p2);
    }

    public Segment2 clone()
    {
        try
        {
            Segment2 cloned = (Segment2) super.clone();
            cloned.p1 = (Point2)p1.clone();
            cloned.p2 = (Point2)p2.clone();
            return cloned;
        }
        catch (CloneNotSupportedException e)
        {
            System.err.println(e);
            return null;
        }
    }
}

