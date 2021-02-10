package task.circle;

public class Main {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2.6);
		Circle circle3 = new Circle(2.9, "red");

		circle1.setRadius(1.2);
		circle1.setColor("blue");
		circle2.setColor("red");

		System.out.println(circle1);
		System.out.println(circle2);
		System.out.println(circle3);
	}
}
