package porb5;

public class ShapeTest {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5, 6);
		Shape rectTriangle = new RectTriangle(6, 2);

		Shape shapes[] = { rectangle, rectTriangle };

		for (Shape shape : shapes) {
			System.out.println("area : " + shape.getArea() + ", perimeter : " + shape.getPerimeter());
			if (shape instanceof Resizeable) {
				((Resizeable) shape).resize(0.5);
				System.out.println("new area : " + shape.getArea() + ", new perimeter : " + shape.getPerimeter());
			}
		}
	}
}