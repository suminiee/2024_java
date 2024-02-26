package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {
	public static void main(String[] args) {
		
		//1
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(8);
		list1.add(9);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(7);
		list1.add(5); 
		System.out.println(list1);
		
		List<Integer> list2 = Arrays.asList(3,8,9,4,2,1,7,5);
		//list2.add(100);//불변의 list이므로 변경 불가
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		System.out.println(list3 + "옹");
		
		//java 12이상
		//List<Integer> list4 = List.of(3, 8, 9, 4, 2, 1, 7, 5);//변경 안할 때
		List<Integer> list4 = new ArrayList<>(List.of(3, 8, 9, 4, 2, 1, 7, 5));//변경 할 때
		System.out.println(list4 + "변경가능");
		list4.add(123);
		System.out.println(list4 + "변경가능");
		
		
		
		//2
		
		list1.set(3, 6);
		System.out.println(list1);
		
		//3

		list1.remove(1);
		list1.remove(6);
		System.out.println(list1);
	}
}
