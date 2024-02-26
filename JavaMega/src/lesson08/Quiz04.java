package lesson08;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
//		1
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int jpg = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".jpg")) {
				jpg++;
			}
		}
		System.out.println("jpg 파일 개수 : " + jpg);
		System.out.println();
		
//		2
		String[] quiz = {"1. 승리을 영어로 입력하세요 : ", "2. 사랑을 영어로 입력 하세요 : ", "3. 컴퓨터를 영어로 입력 하세요 : ", "4. 노트북을 영어로 입력하세요 : "};
		String[] answer = new String[4];
		String[] correctAnswer = {"victory", "love", "computer", "notebook"};
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < quiz.length; i++) {
			System.out.print(quiz[i]);
			answer[i] = sc.next();
			sc.nextLine();
		}
		int score = 0;
		for (int i = 0; i < correctAnswer.length; i++) {
			if (correctAnswer[i].equals(answer[i])) {
				score += 25;
			}
		}
		System.out.println("점수는 " + score + "점 입니다.");
		sc.close();
		
//		4
//		중복이 발견이 되면 그 값에 마킹을 해두면 생각하기 쉬움
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";//이중배열 필요
		String[] names = memberStr.split(":");
		int resultCount = 0;
		
		for (int i = 0; i < names.length - 1; i++) {
			String name = names[i];
			boolean flag = false;
			
			if (name.equals("-")) {
				continue;
			}
			
			for (int j = i+1; j < names.length; j++) {
				if (name.equals(names[j])) {
					flag = true;
					names[j] = "-";
				}
			}
			if (flag) {
				resultCount++;
			}
		}
		System.out.println("중복된 이름 수 : " + resultCount);
	}
}
