package lesson07;

public class Ex01 {
	public static void main(String[] args) {
//		2차원 배열(2-demensional array)
		int[][] scores = {
				{89, 91, 99},
				{100, 98, 75},
				{65, 56, 59},
				{79, 77, 41},
				{97, 68, 71}
		};
		//3번째 학생의 2번째 점수 -> 56
		System.out.println(scores[2][1]);
		//2번째 학생의 1번째 점수 -> 100
		System.out.println(scores[1][0]);
		
		//반복문으로 2차원 배열 값 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		//breakpoint -> debugging	
		//각 학생들의 평균 점수 구하기
		int sum = 0;
		double average;
		for (int i = 0; i < scores.length; i++) {
			sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			average = (double)sum / scores[i].length;
			System.out.println("학생" + (i+1) + " 의 평균 점수 : " + average);
		}
		
		
	}
}
