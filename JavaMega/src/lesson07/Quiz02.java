package lesson07;

public class Quiz02 {
	public static void main(String[] args) {
//		1
		int[][] numbers = new int[2][3];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 10;
			}
		}
		print(numbers);
		
//		2
		int[][] numbers2 = new int[3][4];
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				numbers2[i][j] = j+1;
			}
		}
		print(numbers2);
		
//		3
		int[][] numbers3 = new int[3][3];
		for (int i = 0; i < numbers3.length; i++) {
			for (int j = 0; j < numbers3[i].length; j++) {
				numbers3[i][j] = i+1;
			}
		}
		print(numbers3);
		
//		4
		int[][] numbers4 = new int[5][5];
		for (int i = 0; i < numbers4.length; i++) {
			numbers4[i][2] = 1;
			if (i == 2) {
				for (int j = 0; j < numbers4[i].length; j++) {
					numbers4[i][j] = 1;
				}
			}
		}
		print(numbers4);
		
//		5
		int[][] numbers5 = new int[3][3];
		for (int i = 0; i < numbers5.length; i++) {
			for (int j = 0; j < numbers5[i].length; j++) {
				numbers5[i][j] = (i*numbers5.length)+j+1;
			}
		}
		print(numbers5);
		
		
//		6
		int[][] numbers6 = new int[3][3];
		for (int i = 0; i < numbers6.length; i++) {
			for(int j = 0; j < numbers6[i].length; j++) {
				numbers6[j][i] = (i*numbers6.length)+j+1;
				
			}
		}
		
		
		print(numbers6);
	}
	
	public static void print(int arrays[][]) { //2차원 배열 출력해주는 함수
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
