package task.rectangle;

public class Rectangle {

	private float lenght;
	private float width;

	public float getLenght() {
		return lenght;
	}

	public void setLenght(double d) {
		this.lenght = (float) d;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(double d) {
		this.width = (float) d;
	}

//	public Rectangle() {
//		super();
//		this.lenght = lenght;
//		this.width = width;
//}

	public Rectangle(double d, double e) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + ", Aria = " + getArea() + ", Perimetru = "
				+ getPerimeter() + "]";
	}

	public double getArea() {
		return this.lenght * this.width;
	}

	public double getPerimeter() {
		return this.lenght + this.width + this.lenght + this.width;
	}
}
