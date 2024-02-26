package lesson08;

public class Quiz01 {
	public static void main(String[] args) {
		String birthday = "1995";
		int intBirthday = Integer.valueOf(birthday);
		int age = 2024-intBirthday;
		System.out.println(age + "세");
	}
}
