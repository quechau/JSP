
public class TestShape {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("Yellow", 3, 4);
		Triangle triangle = new Triangle("Blue", 3, 4);
		System.out.println(rectangle.toString());
		rectangle.showInfo();
		System.out.println(triangle.toString());
		triangle.showInfo();

	}
}
