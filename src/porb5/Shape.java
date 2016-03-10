package porb5;

public abstract class Shape {
	protected int countSides;
	
	public Shape(int countSides){
		this.countSides = countSides;
	}
	
	public int getCountSides(){
		return countSides;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
