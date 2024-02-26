package lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요: ");
		int weight = sc.nextInt();
		
		if (weight <= 70) {
			System.out.println("치킨");
		}
		else {
			System.out.println("샐러드");
		}
		
		sc.close();
	}
}
