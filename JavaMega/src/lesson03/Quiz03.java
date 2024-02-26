package lesson03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
//		1번
		int num = 2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("수를 입력하세요: ");
			num = sc.nextInt();
		}while (num != 0);
		System.out.println("끝");
		
		sc.close();
	}
}
