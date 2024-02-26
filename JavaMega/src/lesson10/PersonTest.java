package lesson10;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("이상혁", "19960507", "남자");
		
		p1.SayHello();
		p1.Walk();
		p1.Introduce();
		p1.SayAge();
		
	}
}
