package lesson02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1번
		System.out.print("두 점수를 입력하세요 : ");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		
		if (score1 >= 70 && score2 >= 70) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
//		2번
		System.out.print("수를 입력하세요: ");
		int number = sc.nextInt();
		if (number % 3 == 0 && number % 2 == 0) {
			System.out.println("2와 3의 공배수입니다.");
		}
		else {
			System.out.println("2와 3의 공배수가 아닙니다.");
		}
		
//		3번
		System.out.print("1~10 사이의 수를 입력하세요: ");
		number = sc.nextInt();
		if (number > 10 || number < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			System.out.println("제대로 입력하셨습니다.");
		}
		
		sc.close();
	}
}
