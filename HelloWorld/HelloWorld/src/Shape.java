
public abstract class Shape implements ShapeInterface {
	String color = "No color";

	Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();

	public abstract String toString();
}
