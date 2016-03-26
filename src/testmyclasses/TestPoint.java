package testmyclasses;

import myclasses.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 1);

        System.out.println(p1);
        System.out.println(p2);

        p2.up(2);
        System.out.println(p2);
        p2.left(5);
        System.out.println(p2);
        p2.down(1);
        System.out.println(p2);
        p2.down(4);
        System.out.println(p2);
        p2.right(1);
        System.out.println(p2);
        p2.right(4);
        System.out.println(p2);
        p2.up(2);
        System.out.println(p2);
        p2.left(2);
        System.out.println(p2);

        Point p3 = new Point(2, 1);
        System.out.println(p1.equals(p2));

        Object o = new Point(2, 1);
        System.out.println(o.equals(p3));

        Point p4 = new Point(4,5);
        Point p5 = p4;
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p4 == p5);
        p4.setX(16);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p4 == p5);
    }
}
