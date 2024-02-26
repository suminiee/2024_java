package lesson11;

import java.util.Arrays;
import java.util.Random;

public class LottoChecker {
	private int[] win = new int[6];
	
	public LottoChecker() {
		Random rand = new Random();
		
		for (int i = 0; i < this.win.length; i++) {
			int randNum = rand.nextInt(45) + 1;
			this.win[i] = randNum;
			for (int j = 0 ; j < i; j++) { //i보다 하나 앞 칸을 보면서 중복인지 확인한다.
				if (this.win[j] == randNum) {//중복이라면
					i--; //i칸에서 랜덤 숫자를 다시 뽑기 위해 머무름
					break;
				}
			}
		}
		
	}
	
	public void winNumPrint() {
		System.out.println("당첨번호 : " + Arrays.toString(win));
	}
	
	public String check (Lotto lotto) {
		int count = 0;
		for (int i = 0; i < win.length; i++) {
			for (int j = 0; j < win.length; j++) {
				if (win[i] == lotto.getLottoNums(j)) {
					count++;
					break;
				}
			}
		}
		String cnt = Integer.toString(6-count);
		if (cnt.equals("6")) {
			return "꽝";
		}
		else {
			return cnt;
		}
	}
	
}
