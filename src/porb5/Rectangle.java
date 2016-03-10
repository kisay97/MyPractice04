package porb5;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(int countSides) {
		super(countSides);
	}

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		double re = 0;

		re = width*height;

		return re;
	}

	public double getPerimeter() {
		double re = 0;

		re = (width * 2) + (height * 2);

		return re;
	}
	
	public void resize(double rate){
		width *= rate;
		height *= rate;
	}

}
