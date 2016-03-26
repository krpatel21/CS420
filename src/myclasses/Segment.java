package myclasses;

public class Segment
{
    Point p1;
    Point p2;

    public Segment(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(int x1, int y1, int x2, int y2)
    {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
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

        if (!(o instanceof Segment))
            return false;

        Segment s = (Segment) o;

        return this.p1.equals(s) &&
               this.p2.equals(s);
    }
}

