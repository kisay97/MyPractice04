package porb5;

public class RectTriangle extends Shape{
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

	public RectTriangle(int countSides) {
		super(countSides);
		this.width = 0;
		this.height = 0;
	}
	
	public RectTriangle(double width, double height){
		super(3);
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		double re = 0;
		
		re = width * height / 2;
		
		return re;
	}
	
	public double getPerimeter(){
		double re = 0;
		
		re = Math.pow(width, 2) + Math.pow(height, 2);
		re = Math.sqrt(re);
		
		return re;
	}
}
