package TuGiac;

import Point.*;

public class TuGiac extends Point {
    private Point d1, d2;
    private Point d3, d4;

    public TuGiac(Point p1, Point p2, Point p3, Point p4) {
        d1 = p1;
        d2 = p2;
        d3 = p3;
        d4 = p4;
    }

    public TuGiac() {
        d1 = new Point();
        d2 = new Point(0, 1);
        d3 = new Point(1, 1);
        d4 = new Point(1, 0);
    }

    public void printTuGiac() {
        d1.showPoint();
        d2.showPoint();
        d3.showPoint();
        d4.showPoint();
        System.out.println();
    }

}