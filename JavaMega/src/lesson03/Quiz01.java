package lesson03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1번
		System.out.print("횟수를 입력하세요: ");
		int cnt = sc.nextInt();
		
//		for (int i = 0; i < cnt; i++) {
//			System.out.println("화이팅!!!");
//		}
		while (cnt > 0) {
			System.out.println("화이팅!!!");
			cnt--;
		}
		System.out.println();
		
//		2번
		System.out.print("카운트 다운 수를 입력하세요: ");
		cnt = sc.nextInt();
//		
//		for (int i = cnt; i >= 0; i--) {
//			System.out.println(i);
//		}
//		System.out.println("발사");
		
		while (cnt >= 0) {
			System.out.println(cnt);
			cnt--;
		}
		System.out.println("발사");
		
		System.out.println();
		
		
//		3번
		cnt = 5;
		int num;
		while (cnt != 0) {
			System.out.print("수를 입력하세요: ");
			num = sc.nextInt();
			System.out.println("출력: " + num);
			cnt--;
			
		}
		System.out.println();
		sc.close();
		
//		4번
		
//		for (int i = 1; i < 10; i++) {
//			System.out.println("3 X " + i + " = " + 3*i);
//		}
		
		int i = 1;
		while (i < 10) {
			System.out.println("3 X " + i + " = " + 3*i);
			i++;
		}
	}
}
