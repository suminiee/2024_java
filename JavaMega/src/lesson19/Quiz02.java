package lesson19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz02 {
	public static void main(String[] args) {
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
//		Iterator를 사용한다.
		
		Map<String, String> name = new HashMap<>();
		name.put("유재석", "X");
		name.put("박나래", "X");
		name.put("이지은", "X");
		name.put("서장훈", "X");
		name.put("이광수", "X");
		
		System.out.println(name);
		
		Set<String> keys = name.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String names = iterator.next();
			if (names.startsWith("이")) {
				name.put(names, "O");
			}
		}
		
		System.out.println(name);

	}
}
