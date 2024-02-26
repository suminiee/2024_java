package lesson03;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println();
		
		int j = 0;
		while ( j < 3 ) {
			System.out.println("while안녕");
			j++;//후위증감연산자.
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("안녕");
		}
	}
}
