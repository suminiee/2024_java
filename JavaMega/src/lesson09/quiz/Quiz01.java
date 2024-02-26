package lesson09.quiz;

public class Quiz01{
		public static void main(String[] args) {
		Student st1 = new Student("유재석", 21, "java", "01023453223");
		Student st2 = new Student("이효리", 17, "java", "01012345678");
		
//		st1.Print();
//		st1.isAdult();
//		System.out.println();
//		st2.Print();
//		st2.isAdult();
		
		Student[] std = new Student[2];
		
		std[0] = st1;
		std[1] = st2;
		
		for (int i = 0; i < std.length; i++) {
			std[i].Print();
			std[i].isAdult();
			System.out.println();
		}
	}
} 
