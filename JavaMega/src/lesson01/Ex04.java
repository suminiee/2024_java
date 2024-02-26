package lesson01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사탕의 가격을 입력하세요 : ");
		int candy = sc.nextInt();
		System.out.print("사탕의 개수를 입력하세요 : ");
		int count = sc.nextInt();
		int sum = candy * count;
		System.out.println("사탕의 가격은 " + candy + "원");
		System.out.println("사탕의 개수는 " + count + "개");
		System.out.println("사탕 " + count + "개의 가격은 " + sum + "원");
		sc.close();
	}
}
