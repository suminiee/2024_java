package lesson13;

public class Circle extends Shape{
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double getArea() {
		double area = r*r*Math.PI;
		return area;
	}
	
	public void printArea() {
		System.out.println("도형은 원이며 넓이는 " + getArea() + "cm^2 입니다.");
	}
}
