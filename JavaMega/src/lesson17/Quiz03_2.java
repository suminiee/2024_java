package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz03_2 {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> addNameList = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		
		
		//Iterator<String> iterator =  addNameList.iterator();
		//Iterator<String> iterator2 = nameList.iterator();
		for (int i = 0; i < nameList.size(); i++) {
			int count = 1;
			for (int j = 0; j < addNameList.size(); j++) {
				if (nameList.get(i).equals(addNameList.get(j))) {
					addNameList.set(j, addNameList.get(j) + count++); //String + int => String
				}
			}
		}
		
		nameList.addAll(addNameList);
		
//		System.out.println(addNameList);
		System.out.println(nameList);
	}
}
