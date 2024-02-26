package lesson02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(month)를 입력하세요: ");
		int month = sc.nextInt();
		
//		switch (month) {
//		case 3 :
//		case 4 : 
//		case 5 :
//			System.out.println("봄");
//			break;
//		case 6 :
//		case 7 :
//		case 8 :
//			System.out.println("여름");
//			break;
//		case 9 : 
//		case 10 :
//		case 11 :
//			System.out.println("가을");
//			break;
//		case 12 :
//		case 1 : 
//		case 2 : 
//			System.out.println("겨울");
//			break;
//		default : 
//			System.out.println("잘못된 입력");
//		}
		
		//case 1, 2, 3 : => java 14 버전 이상 사용 가능.
		
//		개선된 switch문 => java 14버전 이상 사용 가능.
			
		
		switch (month) {
		case 3, 4, 5 -> System.out.println("봄");//break가 포함되었다고 생각하면 됨
		case 6, 7, 8 -> System.out.println("여름");
		case 9, 10, 11 -> System.out.println("가을");
		case 12, 1, 2 -> System.out.println("겨울");
		}
		sc.close();
	}
}
