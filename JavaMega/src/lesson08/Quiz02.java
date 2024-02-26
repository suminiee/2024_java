package lesson08;

public class Quiz02 {
	public static void main(String[] args) {
		
//		1
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
//		2
		String birth = "19950721";
		birth = birth.substring(0, 4);
		int birthday = Integer.valueOf(birth);
		System.out.println(2024-birthday + "세");
		
//		3
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] sen = sentence.split(" ");
		System.out.println("단어 개수 : " + sen.length);
		
		
		
		
		
		
		
	}
}
