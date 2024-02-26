package lesson07;

public class Quiz01 {
	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		1
		double[] freq = new double[6];
		int sum = 0;
		double average;
		for (int i = 0; i < scores.length; i++) {
			sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			average = (double)sum /scores[i].length;
			freq[i+1] = average;
			System.out.println((i+1) + "번째 학생의 평균은 " + average);
		}
		System.out.println();
		
//		2
		int max;
		for (int i = 0; i < scores.length; i++) {
			max = scores[i][0];
			for (int j = 0; j < scores[i].length; j++) {
				if (max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			System.out.println((i+1) + "번째 학생의 최고점은 " + max);
		}
		System.out.println();
		
//		3
		double maxAve = freq[0];
		int index = 0;
		for (int i = 1; i < freq.length; i++) {
			if (maxAve < freq[i]) {
				maxAve = freq[i];
				index = i;
			}
		}
		System.out.println("평균이 가장 높은 학생은 " + index + "번째 학생이고, 평균 점수는 " + maxAve);
		System.out.println();
		
		
		
//		4
		max = scores[0][3];
		index = 0;
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i][3]) {
				max = scores[i][3];
				index = i;
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + (index+1) + "번째 학생이고, 점수는 " + max);
		System.out.println();
		
		
//		5
		double[] freq3 = new double[6];
		for (int i = 0; i < scores.length; i++) {
			sum = 0;
			for (int j = 3; j < 8; j++) {
				sum += scores[i][j];
			}
			average = (double)sum/5;
			freq3[i+1] = average;
		}
		maxAve = freq3[0];
		index = 0;
		for (int i = 1; i < freq3.length; i++) {
			if (maxAve < freq3[i]) {
				maxAve = freq3[i];
				index = i;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + index + "번째 학생이고, 평균은 " + maxAve +"입니다. ");
	}
}
