import Point.Point;
import TuGiac.TuGiac;

public class App {
    public static void main(String[] args) throws Exception {
        Point d1 = new Point(2, 3);
        Point d2 = new Point(4, 1);
        Point d3 = new Point(5, 1);
        Point d4 = new Point(8, 4);

        TuGiac tg1 = new TuGiac(d1, d2, d3, d4);
        TuGiac tg2 = new TuGiac();
        tg1.printTuGiac();
        tg2.printTuGiac();
    }
}
