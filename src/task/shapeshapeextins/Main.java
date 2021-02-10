package task.shapeshapeextins;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(3.0, "Red", false);
		System.out.println(circle);
		
		Rectangle rectangle = new Rectangle(2.0, 3.0, null, false);
		System.out.println(rectangle);
		
		Square square = new Square();
		System.out.println(square);
	}
}
