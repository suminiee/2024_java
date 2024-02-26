package lesson17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		//1
		list1.add(20);
		list1.add(3);
		list1.add(5);
		list1.add(84);
		list1.add(17);
		
		//2
		int min = list1.get(0);
		for (int i = 1; i < list1.size(); i++) {
			if (min > list1.get(i)) {
				min = list1.get(i);
			}
		}
		System.out.println(min);
		
		//3
		int sum = 0;
		Iterator<Integer> iterator = list1.iterator();
		while(iterator.hasNext()) {
			 sum += iterator.next();
		}
		System.out.println(sum);
	
	}
}
