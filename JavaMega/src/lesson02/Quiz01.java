package lesson02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
//		1번
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		if (number > 10){
			System.out.println("10보다 큽니다.");
		}
		else if (number < 10) {
			System.out.println("10보다 작습니다");
		}
		else {
			System.out.println("10과 같습니다.");
		}
		
//		2번
		System.out.print("두 개의 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "이 더 큽니다.");
		}
		else if (num1 < num2) {
			System.out.println(num2 + "이 더 큽니다.");
		}
		else {
			System.out.println(num1 + "와 " + num2 + "는 같습니다.");
		}
		
//		3번
		System.out.print("성적을 입력하세요: ");
		int score = sc.nextInt();
		if (score >= 70) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
//		4번
		System.out.print("수를 입력하세요: ");
		int even = sc.nextInt();
//		boolean isEven = even % 2 == 0; // true or false
		if (even % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}
}
