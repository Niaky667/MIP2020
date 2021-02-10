package task.shape;

public class Square extends Rectangle {
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);  
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setWidth(double side) {
		super.setWidth(getWidth());
	}

	public void setLength(double side) {
		super.setLength(getLength());
	}

	@Override
	public String toString() {
		return "Square Width = " + getWidth() + ", Length = " + getLength() + ", Color = " + getColor()
				+ ", Filled = " + isFilled();
	}

}
