package lesson13;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		int area = width*height;
		return area;
	}
	
	public void printArea() {
		System.out.println("도형은 사각형이며 넓이는 " + getArea() + "cm^2 입니다.");
	}
}
