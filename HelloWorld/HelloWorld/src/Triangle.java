
public class Triangle extends Shape {
	public int base = 0;
	public int height = 0;

	public Triangle(String color, int b, int h) {
		super(color);
		// TODO Auto-generated constructor stub
		this.base = b;
		this.height = h;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Triangle \n[base=" + base + ", height=" + height + ", color=" + color + "]" + "\nArea = "
				+ this.getArea();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return ((height * base) / 2);
	}

	@Override
	public void showInfo() {
		System.out.println("Print from Triangle Class");
		
	}

}
