package task.mypoint;

/**
 *
 * @author nicol
 */
public class Main {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint((i + 1), (i + 1));
        }

        for (MyPoint p : points) {
            System.out.println("Distance " + p1 + " and " + p + " is " + p1.distance(p));
        }

        System.out.println();
        MyPoint p2 = new MyPoint(1, 1);
        MyPoint p3 = new MyPoint(3, 7);
        System.out.println("Distance: " + p2 + " to: " + p3 + " is: " + p2.distance(p3));
        System.out.println(p2.distance(3, 7));
    }
}
