package lesson06;

public class Quiz01 {
	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
//		1번
		numbers[3] = 6;
		
//		2번
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		3번
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		4번
		for (int i = 0; i <numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
//		5번
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 index는 " + i);
			}
		}
		
//		6번
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 " + max);
		
//		7번
		int index = 0;
		int min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) {
				index = i;
				min = numbers[i];
			}
		}
		System.out.println("최소값의 인덱스는 " + index);
		
//		8번
		int sum = 0;
		for (index= 0; index < numbers.length; index++) {
			sum += numbers[index];
		}
		double average = (double)sum / index;
		System.out.println("평균은 " + average);
	}
}
