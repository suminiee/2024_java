package lesson01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
//		1번
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1:");
		int num1 = sc.nextInt();
		System.out.print("입력2:");
		int num2 = sc.nextInt();
		
		System.out.println("몫 : " + num1/num2 + ", 나머지 : " + num1%num2);
		
//		2번
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		int temp = x;
		x = y;
		y = temp;
		
		System.out.printf("x는 %d이고 y는 %d입니다.\n", x, y);
		
	
//		3번 초변환
		System.out.print("초 입력 : ");
		int sec = sc.nextInt();
		System.out.println(sec/60 + "분 " + sec%60 + "초");
		
//		4번
		System.out.print("입력 : ");
		int number = sc.nextInt();
		int first = number/1000;
		int second = (number/100)%10;
		int third = (number/10)%100%10;
		int fourth = number%1000%100%10;
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		
//		5번
		System.out.print("입력 : ");
		number = sc.nextInt();
		first = number/1000;
		second = (number/100)%10;
		third = (number/10)%100%10;
		fourth = number%1000%100%10;
		System.out.println(first+second+third+fourth);
		
		sc.close();
	}
}
