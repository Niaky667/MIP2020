package task.circle;

public class Circle {

	private double radius;
	private String color;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", Aria = " + getArea() + "]";
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public void setWidth(double d) {
		// TODO Auto-generated method stub
		
	}

	public String getLength() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWidth() {
		// TODO Auto-generated method stub
		return null;
	}
}
