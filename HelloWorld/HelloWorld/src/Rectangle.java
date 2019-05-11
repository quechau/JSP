
public class Rectangle extends Shape implements ShapeInterface{
	public int length = 0;
	public int width = 0;

	public Rectangle(String color, int l, int w) {
		super(color);
		// TODO Auto-generated constructor stub
		this.length = l;
		this.width = w;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getArea() {
		return (width * length);
	}

	@Override
	public String toString() {
		return "Rectangle \n[length=" + length + ", width=" 
				+ width + ", color=" + color + "]"
				+ "\nArea = "+ this.getArea();
	}
	public void showInfo() {
		System.out.println("Print from Rectangle Class");
	}

}
