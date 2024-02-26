package lesson13;

public class Triangle extends Shape{
	private int width;
	private int height;
	
	public Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width*height/2;
		return area;
	}
	
	public void printArea() {
		System.out.println("도형은 삼각형이며 넓이는 " + getArea() + "cm^2 입니다.");
	}
}
