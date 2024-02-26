package lesson11;

import java.util.Arrays;

public class OmrCardReader {
	private int[] ans = new int[5];
	
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		this.ans[0] = a1;
		this.ans[1] = a2;
		this.ans[2] = a3;
		this.ans[3] = a4;
		this.ans[4] = a5;
	}
	
	
	public void print(OmrCard oc) {
		int score = 0;
		for (int i = 0; i < this.ans.length; i++) {
			if (this.ans[i] == oc.getAnswer(i)) {
				score += 20;
			}
		}
		System.out.println("이름 : " + oc.getName());
		System.out.println("학번 : " + oc.getNumber());
		System.out.println("점수 : " + score);
	}
	
	
	public void printAns() {
		System.out.println(Arrays.toString(ans));
	}
	
	
}
