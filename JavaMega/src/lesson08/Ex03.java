package lesson08;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "eclipse";
		
		//charAt : n번째 index칸에 무슨 문자가 있는지 확인
		System.out.println(s1.charAt(3));
		
		//contains : 특정 문자열이 문자열에 포함되어 있는지 확인 boolean값을 return
		System.out.println(s1.contains("lip"));
		System.out.println(s1.contains("a"));
		
		//startWith : 특정 문자열로 시작하는지 확인 boolean값을 return
		System.out.println(s1.startsWith("e"));
		System.out.println(s1.startsWith("ecl"));
		
		//endWith : 특정 문자열로 끝나는지 확인
		System.out.println(s1.endsWith("e"));
		
		//length : 문자열의 길이, 알파벳의 개수
		System.out.println(s1.length());

		//replace : 문자열 치환, 문자열 교체
		String s2 = "지금 먹고 싶은 음식은 치킨이다.";
		s2 = s2.replace("치킨", "과자");
		System.out.println(s2);
		
		//split : 특정 문자열을 기준으로 잘라서 배열에 넣는다.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		System.out.println();
		
		//substring : 문자열 추출, 원하는 문자열만 뽑아냄
		String s4 = "javastudy";
		//study 추출.
		System.out.println(s4.substring(4)); //4부터 끝까지 출력됨
		System.out.println(s4.substring(4, 9)); //마지막 index는 1을 더해서 써줘야함.
		System.out.println(s4.substring(0, 4));
	}
}
