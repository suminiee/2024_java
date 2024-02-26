package lesson09.quiz;

public class Student {
	String name;
	String className;
	int age;
	String tel;
	
	public Student(String name, int age, String className, String tel) {
		this.name = name;
		this.className = className;
		this.age = age;
		this.tel = tel;
	}
	
	void isAdult() {
		if (this.age >= 20) {
			System.out.println(this.name + "은 성인입니다.");
		}
		else {
			System.out.println(this.name + "은 미성년자 입니다.");
		}
	}
	
	void Print() {
		System.out.println(this.name);
		System.out.println(this.className);
		System.out.println(this.age);
		System.out.println(this.tel);
	}
	
}
