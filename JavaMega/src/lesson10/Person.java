package lesson10;

public class Person {
	String name;
	String birthdate;
	String sex;
	
	public Person(String name, String birthdate, String sex) {
		this.name = name;
		this.birthdate = birthdate;
		this.sex = sex;
	}
	
	
	void SayHello() {
		System.out.println("안녕하세요");
	}
	
	void Walk() {
		System.out.println("걷는다.");
	}
	
	void Introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.sex + "이다.");
	}
	
	
	void SayAge() {
		int year = Integer.valueOf(this.birthdate.substring(0, 4));
		System.out.println("나이는 " + (2024-year) + "세 이다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthdate=" + birthdate + ", sex=" + sex + "]";
	}
	
	
}
