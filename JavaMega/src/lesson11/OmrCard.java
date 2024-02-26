package lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class OmrCard {
	private String number;
	private String name;
	private int[] answer = new int[5];
	
	public OmrCard(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void insertAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("순서대로 답 5개를 입력하세요: ");
		for(int i = 0; i < this.answer.length; i++) {
			this.answer[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void printAnswer() {
		System.out.println(Arrays.toString(this.answer));
	}
	public int getAnswer(int i) {
		int answ = this.answer[i];
		return answ;
	}
}
