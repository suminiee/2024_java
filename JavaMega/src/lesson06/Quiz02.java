package lesson06;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
//		1번
		Scanner sc = new Scanner(System.in);
//		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("변경할 index와 값을 입력하세요: ");
//		int index = sc.nextInt();
//		int value = sc.nextInt();
//		
//		numbers[index] = value;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();

		
//		2번
		char[] score = {'X', 'O', 'O', 'X', 'X',  'O', 'O', 'O', 'O', 'X'};
		int correct = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 'O') {
				correct++;
			}
		}
		System.out.println(correct*10 + "점");
		
//		3번
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int weekday = 0;
		int weekend = 0;
		for (int i = 0; i < works.length; i++) {
			if (i >= 0 && i < 5) {
				weekday += works[i];
			}
			else {
				weekend += works[i];
			}
		}
		int money = 8500 * weekday + 9500 * weekend;
		System.out.println("일주일간 총 임금은 " + money + "원");
		
//		4번
		int[] arrays = new int[5];
		int number = 0;
		int index2 = 0;
		do {
			System.out.print("수를 입력하세요: ");
			number = sc.nextInt();
			if (number % 2 == 0) {
				arrays[index2] = number;
				index2++;
			}
		}while(index2<5);

		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		
		sc.close();
		
	}
}
