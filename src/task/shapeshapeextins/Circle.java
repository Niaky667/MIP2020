package task.shapeshapeextins;

import task.shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

	@Override
	public String toString() {
		return "Circle: Radius = " + getRadius() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter()
				+ ", Color = " + getColor();
	}	
}

