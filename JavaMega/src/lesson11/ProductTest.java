package lesson11;

public class ProductTest {
	public static void main(String[] args) {
		Product pd1 = new Product("새우깡", 1300, "2024-01-14");
		System.out.println("이름 : " + pd1.getName());
		System.out.println("가격 : " + pd1.getPrice());
		System.out.println("유통기한 : " + pd1.getExpiration());
		System.out.println();
		pd1.Cost(5);
		pd1.Cost(13);
		pd1.availableSale();
		
		
		
	}
}
