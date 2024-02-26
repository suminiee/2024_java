package lesson02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("몸무게를 입력하세요: ");
//		int weight = sc.nextInt();
//		
//		if (weight<70) {
//			System.out.println("치킨");
//		}
//		if (weight >= 100) {
//			System.out.println("다이어트");
//		}
//		if (weight == 65) {
//			System.out.println("65kg");
//		}
//		if (weight != 75) {
//			System.out.println("75kg가 아니다.");
//		}
		
		System.out.print("두 개의 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		System.out.println(num1);
//		System.out.println(num2);
		if (num1 > num2) {
			System.out.println("n1이 더 크다");
		}
		else if (num1 < num2) {
			System.out.println("n2가 더 크다");
		}
		else
		{
			System.out.println("n1과 n2가 같다.");
		}
		sc.close();
	}
}
