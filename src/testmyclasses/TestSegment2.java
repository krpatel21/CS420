package testmyclasses;

import myclasses.Point2;
import myclasses.Segment2;

public class TestSegment2
{
    public static void main(String[] args)
    {
        Point2 a = new Point2(2, 3);
        Point2 b = new Point2(2, 0);
        Point2 c = new Point2(2, -2);
        Point2 d = new Point2(-3, -2);
        Point2 e = new Point2(-2, 0);

        Segment2 ab = new Segment2(a, b);
        Segment2 ad = new Segment2(a, d);
        Segment2 ae = new Segment2(a, e);
        Segment2 be = new Segment2(b, e);

        System.out.println(ab);
        System.out.println(ad);
        System.out.println(ae);
        System.out.println(be);

        System.out.println(ab.length());
        System.out.println(ad.length());
        System.out.println(ae.length());
        System.out.println(be.length());

        System.out.println(ab.equals(ae));
        Segment2 az = ab.clone();
        System.out.println(az.equals(ab));
    }
}

