package lesson08;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
//		1
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.println("Welcome! " + id);
		sc.nextLine(); //->엔터 누른거 날려버림. 불필요한 공백 날려버림
		
//		2
		System.out.print("단어를 입력하세요 : "); //문장출력은 nextLine();
		String voca = sc.next();
		int findE = 0;
		for (int i = 0; i < voca.length(); i++) {
			if (voca.charAt(i) == 'e') {
				findE++;
			}
		}
		System.out.println("e의 개수는 " + findE + "개 입니다.");
		sc.nextLine();
		sc.close();
	}
}
