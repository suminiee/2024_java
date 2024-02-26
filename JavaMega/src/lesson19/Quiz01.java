package lesson19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		
		//1
		
		scoreMap.put("국어", 90);
		scoreMap.put("수학", 85);
		scoreMap.put("영어", 90);
		scoreMap.put("사회", 80);
		scoreMap.put("과학", 100);
		System.out.println(scoreMap);
		
		//2
		
		scoreMap.put("사회", scoreMap.get("사회") + 5);//96점 이상인 애들을 위한 if문이 필요하긴 함.
		System.out.println(scoreMap);
		
		//3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 과목명을 입력하세요: ");
		String subject = sc.next();
		sc.close();
		if (scoreMap.containsKey(subject)) {
			System.out.print(subject + " : " + scoreMap.get(subject));
		}
		else {
			System.out.println("자료없음");
		}
		System.out.println();
		
		//4.90점 이상인 과목 출력
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			subject = iterator.next();
			if (scoreMap.get(subject) >= 90) {
				System.out.print(subject + " ");
			}
		}
		
//		for (String subjects : scoreMap.keySet()) {
//			int score = scoreMap.get(subjects);
//			if (score >= 90) {
//				System.out.print(subjects + " ");
//			}
//		}
		System.out.println();
		
		//5. 100점 성적이 있으면 성적우수상 받을 수 있음 / 받을 수 있는지 확인 
		int flag = 0;
		for (Integer scoreValue : scoreMap.values()) {
			if (scoreValue == 100) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("수상 가능 ");
		}
		else {
			System.out.println("수상 불가능 ");
		}
	}
}
