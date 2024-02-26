package lesson02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//논리연산자 ( 그리고, 또는, 부정 )
		
		Scanner sc = new Scanner(System.in);
		
//		int number = sc.nextInt();
//		if (number >= 10 && number <= 40){
//			System.out.println("number가 10 이상이고 40 이하이다.");
//		}
//		
//		if (number < 10 || number > 40) {
//			System.out.println("number가 10 미만이거나 40 이상이다.");
//		}
		
		System.out.print("걸음 수와 몸무게를 입력하세요 : ");
		int walk = sc.nextInt();
		int weight = sc.nextInt();
		
		if (walk > 10000 && weight <= 70) {
			System.out.println("둘 다 만족하니 떡볶이 막자");
		}
		else if (walk > 10000 || weight <= 70) {
			System.out.println("둘 중 하나는 만족하니까 떡볶이 막자");
		}
		else
			System.out.println("굶으삼");
		sc.close();
	}
}
