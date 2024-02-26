package lesson03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
//		1번
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		2번
		for (int i = 5; i > -6; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		3번
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		4번
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				cnt++;
			}
		}
		System.out.println("7의 배수의 개수는 : " + cnt);
		System.out.println();
		
//		5번
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num +" X " + i + " = " + num*i);
		}
		
		sc.close();
	}
}
