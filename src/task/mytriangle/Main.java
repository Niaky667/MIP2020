package task.mytriangle;

/**
 *
 * @author nicol
 */
public class Main {

    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(3, 3, 4, 4, 7, 7);
        MyTriangle t2 = new MyTriangle(new MyPoint(3, 3), new MyPoint(4, 4), new MyPoint(7, 7));

        System.out.println("Triangle " + t1 + " is " + t1.printType() + " with perimeter " + t1.getPerimeter());
        System.out.println("Triangle " + t2 + " is " + t2.printType() + " with perimeter " + t2.getPerimeter());
    }

}
