package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03_1 {
	public static void main(String[] args) {
		//1
		//sort사용하면 더 쉽게 짤 수 있음..
		List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		
		Integer min = list1.get(0);
		Integer max = list1.get(0);
		
		for (int i = 1; i < list1.size(); i++) {
			if (min > list1.get(i)) {
				min = list1.get(i);
			}
			if (max < list1.get(i)) {
				max = list1.get(i);
			}
		}
		
		list1.remove(min);
		list1.remove(max);
		//System.out.println(list1);
		
		double average = 0;
		for (int i = 0; i < list1.size(); i++) {
			average += list1.get(i);
		}
		average /= list1.size();
		
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);
	}
}
