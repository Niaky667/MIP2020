package task.mycircle;

/**
 *
 * @author nicol
 */
public class Main {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(4, 1, 4);
        MyCircle c2 = new MyCircle(new MyPoint(2, 2), 7);

        System.out.println("Circle c1: " + c1);
        System.out.println("Circle c2: " + c2);

        c1.setRadius(5);
        System.out.println("Radius c1 now is " + c1.getRadius());

        c2.setCenterXY(3, 3);
        System.out.println("Center c2 now is " + c2.getCenter());

        c1.setCenter(new MyPoint(4, 4));
        System.out.println("Center c1 now is " + c1.getCenter());

        System.out.println("Area c1 is " + c1.getArea());
        System.out.println("Area c2 is " + c2.getArea());
        
        System.out.println("Circumference c1 is " + c1.getCircumference());
        System.out.println("Circumference c2 is " + c2.getCircumference());
    }
}
