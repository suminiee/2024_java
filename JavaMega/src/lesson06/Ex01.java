package lesson06;

public class Ex01 {
	public static void main(String[] args) {
		//배열(Array) : 같은 자료형의 묶음
		
		//배열의 초기화
		int[] score = {89, 100, 98, 72, 56};
		for (int i = 0; i < score.length; i++) {
			System.out.println(i+1 + "번째 값 : " + score[i]);
		}
		
		//
		int[] numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 11;
		numbers[2] = 12;
		numbers[3] = 13;
		numbers[4] = 14;
		System.out.println(numbers[1]);
		System.out.println(numbers); //=>hash값이 print됨

		//배열의 값 변경
		numbers[1] = 15;
		System.out.println(numbers[1]);
		
		
	}
}
