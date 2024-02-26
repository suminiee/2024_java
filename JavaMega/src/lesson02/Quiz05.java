package lesson02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1번
		System.out.print("두 점수를 입력하세요: ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		double average = (double)(score1 + score2)/2;
		
		if (average >= 70) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		
//		2번
		System.out.print("세 개의 수를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = num1;
		
		if (num2 > num1) {
			max = num2;
		}
		else if (num3 > num1) {
			max = num3;
		}
		System.out.println(max);
		
		
//		3번
		System.out.print("점수1 : ");
		int sc1 = sc.nextInt();
		System.out.print("점수2 : ");
		int sc2 = sc.nextInt();
		double ave = (double)(sc1 + sc2) / 2;
		
		if (ave >= 60) {
			if (sc1 >= 50 && sc2 >= 50) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		else {
			System.out.println("과락");
		}
		
//		4번
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
		
//		5번
		System.out.print("윷 상태를 입력하세요: ");
		int yut1 = sc.nextInt();
		int yut2 = sc.nextInt();
		int yut3 = sc.nextInt();
		int yut4 = sc.nextInt();
		int cnt = 0;
		
		if (yut1 == 1) {
			cnt++;
		}
		if (yut2 == 1) {
			cnt++;
		}
		if (yut3 == 1) {
			cnt++;
		}
		if (yut4 == 1) {
			cnt++;
		}
		
		switch (cnt) {
		case 1 : 
			System.out.println("도");
			break;
		case 2 : 
			System.out.println("개");
			break;
		case 3 : 
			System.out.println("걸");
			break;
		case 4 : 
			System.out.println("윷");
			break;
		default : 
			System.out.println("모");
		}
		
		sc.close();
	}
}
