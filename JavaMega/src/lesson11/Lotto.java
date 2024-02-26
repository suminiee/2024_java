package lesson11;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] lottoArray = new int[6];

	public void manual(int a, int b, int c, int d, int e, int f) {
		this.lottoArray[0] = a;
		this.lottoArray[1] = b;
		this.lottoArray[2] = c;
		this.lottoArray[3] = d;
		this.lottoArray[4] = e;
		this.lottoArray[5] = f;
	}
	
	public void auto() {
		Random rand = new Random();
		for (int i = 0; i < this.lottoArray.length; i++) {
			int randNum = rand.nextInt(45) + 1;
			this.lottoArray[i] = randNum;
			for (int j = 0 ; j < i; j++) { //i보다 하나 앞 칸을 보면서 중복인지 확인한다.
				if (this.lottoArray[j] == randNum) {//중복이라면
					i--; //i칸에서 랜덤 숫자를 다시 뽑기 위해 머무름
					break;
				}
			}
		}
	}

	
	public void printLotto() {
		System.out.println("선택한 번호 : " + Arrays.toString(this.lottoArray));
	}
	
	public int getLottoNums(int i) {
		int check = this.lottoArray[i];
		return check;
	}
//올림차순 정렬도 필요할듯
}
