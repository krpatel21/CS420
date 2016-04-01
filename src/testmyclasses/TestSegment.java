package testmyclasses;

import myclasses.Point;
import myclasses.Segment;

public class TestSegment
{
    public static void main(String[] args)
    {
        Point a = new Point(2, 3);
        Point b = new Point(2, 0);
        Point c = new Point(2, -2);
        Point d = new Point(-3, -2);
        Point e = new Point(-2, 0);

        Segment ab = new Segment(a, b);
        Segment ad = new Segment(a, d);
        Segment ae = new Segment(a, e);
        Segment be = new Segment(b, e);

        System.out.println(ab);
        System.out.println(ad);
        System.out.println(ae);
        System.out.println(be);

        System.out.println(ab.length());
        System.out.println(ad.length());
        System.out.println(ae.length());
        System.out.println(be.length());

        System.out.println(ab.equals(ae));
    }
}

