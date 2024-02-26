package lesson06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
//		1번
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 index를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp = numbers[num1];
		numbers[num1] = numbers[num2];
		numbers[num2] = temp;
		sc.close();
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		2번
		Random rand = new Random();
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(numbers2));
		// 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.     
		for (int i = 0; i < 100; i++) {
		    int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
		    // swap 구현
		    temp = numbers2[0];
		    numbers2[0] = numbers2[randIndex];
		    numbers2[randIndex] = temp;
		}
		System.out.println(Arrays.toString(numbers2));
		
		
//		3번
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] freq = new int[6]; //0번 index는 버리기
		
		for (int i = 0; i < numbers3.length; i++) {
			freq[numbers3[i]]++;
		}
		
		for (int i = 1; i < freq.length; i++) {
			System.out.println(i + " : " + freq[i] + "개");
		}
	}
}
