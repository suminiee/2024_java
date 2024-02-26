package lesson11;

public class Product {
	private String name;
	private int price;
	private String expiration;
	
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	public void Cost(int value) {
		System.out.println("제품 " + value + "개의 가격 : " + value*this.price);
	}
	
	public void availableSale() {
//		String[] expirationDate = this.expiration.split("-");
//		int year = Integer.valueOf(expirationDate[0]);
//		int month = Integer.valueOf(expirationDate[1]);
//		int day = Integer.valueOf(expirationDate[2]);
//		
//		if (year > 2024) {
//			System.out.println("판매 가능 상품");
//		}
//		else if (year == 2024 && month > 1) {
//			System.out.println("판매 가능 상품");
//		}
//		else if (year == 2024 && month == 1 && day >= 15) {
//			System.out.println("판매 가능 상품");
//		}
//		else {
//			System.out.println("판매 불가 상품");
//		}
		
		//A.compareTo(B)
		//return값 : A가 기준값일 때 A가 더 크면 1을 반환 (앞에있는게 더 크면 1)(둘이 같으면 0)(작으면 -1)
		if (this.expiration.compareTo("2024-01-15") >= 0) {
			System.out.println("판매 가능 상품");
		}
		else {
			System.out.println("판매 불가 상품");
		}
		
		
		
		
		
		
		
		
		
	}
	
}
