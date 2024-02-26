package lesson13;

public class AnimalTest {
	public static void main(String[] args) {
		 Animal[] animal = new Animal[2];
	     animal[0] = new Cat();
	     animal[1] = new Dog();
	     
	     //up casting -> 자식을 부모 타입으로 캐스팅을 함.(형변환)
//	     부모 class의 메소드를 사용할 수 있다.
//	     부모 클래스에 있는 메소드를 override하면 override한 내용으로 호출됨(=자식쪽에서 호출됨)
	     
	     
//	     down casting -> 부모가 자식으로 형변환
//	     1. 자식 클래스가 여러개이기 때문에 명확하게 캐스팅 문법을 명시해야한다
//	     2. 어던 자식 클래스인지 instanceof 명령어를 사용하여 검사한다.
	     
	     for (int i = 0; i < animal.length; i++) {
	    	 if (animal[1] instanceof Dog) {
		    	 Dog dog = (Dog)animal[1];
		    	 dog.cry();
		    	 dog.tail();
		     }
		     else if (animal[0] instanceof Cat) {
		    	 Cat cat = (Cat)animal[0];
		    	 cat.cry();
		    	 cat.grooming();
		     }
	     }
	}
}
