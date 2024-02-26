package lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("튀르키예", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
        // TODO: 구현하기
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        	indexList.add(rand.nextInt(keys.size())+1);
        }
        
        //delete same index
        int indexTest = 0;
        for (int i = 1; i < 5; i++) {
        	indexTest = indexList.get(i);
        	for (int j = 0; j < i; j++) {
        		if (indexTest == indexList.get(j)) {
        			indexList.set(j, rand.nextInt(keys.size())+1);
        			i--;
        		}
        	}
        }
        
        
        int score = 0;
        for (int i = 0; i < 5; i++) {
        	System.out.print(keyList.get(indexList.get(i)) + "의 수도는 이름은? : ");
        	String answer = sc.next();
        	if (answer.equals(capitalMap.get(keyList.get(indexList.get(i))))){
        		score += 20;
        		System.out.println("정답");
        	}
        	else {
        		System.out.println("틀렸습니다.");
        	}
        }
        System.out.println("총 점수는 : " + score);
        
        sc.close();
    }
}
