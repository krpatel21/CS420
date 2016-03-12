package myclasses;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setPoint(int newX, int newY)
    {
        x = newX;
        y = newY;
    }

    public void up(int y)
    {
        this.y += y;
    }

    public void down(int y)
    {
        this.y -= y;
    }

    public void left(int x)
    {
        this.x -= x;
    }

    public void right(int x)
    {
        this.x += x;
    }

    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Point))
            return false;

        Point p = (Point) o;

        return x == p.getX() && y == p.getY();
    }
}
