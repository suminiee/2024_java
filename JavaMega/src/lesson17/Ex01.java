package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		//list
//		1. 크기가 고정되어 있지 않고 동적으로 할당 가능
//		2. 중간에 있는 값을 빼내면 앞으로 당겨진다.
//		3. 여러 기능(메소드)를 사용할 수 있다.
//		4. 기본 자료형은 담을 수 없고 클래스 타입만 담을 수 있다.
//		5. 타입 안정성을 보장하는 generic 문법을 사용한다

//		List list1 = new ArrayList();
		List<Integer> list1 = new ArrayList<>();//linkedlist와 구현되는 방식만 다를 뿐이라 메소드는 그대로 사용 가능함.
		list1.add(5);
		list1.add(3);		
		System.out.println(list1.add(8));//boolean으로 return해줌
		System.out.println(list1);
		System.out.println(list1.toString());
		
		//List interface의 실제 구현체인 LinkedList
		List<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.addAll(list1); //list1을 3 뒤에 그대로 넣겠다.
		System.out.println(list2);//[3, 5, 3, 8]
		
		//요소 수정하기
		//list2의 -0번째 인덱스 값을 100으로 변경
		System.out.println(list2.set(0, 100));//원래 3이엇음
		//list2.set(0, 100);
		System.out.println(list2);
		
		//요소 삭제하기
		//list2.remove(1);//칸번호로 삭제
		System.out.println(list2.remove(1));//index 1칸 요소 제거, return : 삭제 된 값.
		System.out.println(list2);
		
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("야구보고싶당~");
		strList1.add("최강삼성구자욱~");
		strList1.add("김도영");
		System.out.println(strList1);
		System.out.println(strList1.remove("김도영"));//삭제 여부를 return해줌
		System.out.println(strList1);
		
		
		//향상된 for문으로 반복문을 돌리는 방법(웹 개발 전까지는 사용하지 말 것)
		//중간에 추가하거나 삭제하지 않는다(조회 , 출력시에만 사용) => 오류 발생
		//추가하거나 삭제를 원할 경우 iterlator 사용
		List<String> strList = new ArrayList<>(Arrays.asList("banana", "strawberry", "grape", "melon", "watermelon"));
		for (String fruit : strList) {
			System.out.println(fruit);
			
			//if (fruit.startsWith("b")) {
			//	strList.remove(fruit);
			//}
		}
		
	}
}
