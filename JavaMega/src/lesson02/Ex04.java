package lesson02;

import java.util.Scanner;

//switch문

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		
//		switch : '같다' 조건일 때 if문을 대체해서 사용할 수 있다.
		
		switch (number) {
		case 1 : 
			System.out.println("1이다.");
			break;
		case 2 :
			System.out.println("2이다.");
			break;
		default : //else 느낌.
			System.out.println("1이나 2가 아니다.");
		}
		
		sc.close();
	}
}
