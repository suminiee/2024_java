package lesson20;

public class Ex01 extends Thread{
	public static void main(String[] args) {
		//쓰레드 만들기(1): Thread 클래스 상속 - 가끔 문제 발생
		//자바는 단일 상속이므로 쓰레드를 상속받게 되면 다른 클래스를 상속받지 못하게 됨
		//그 대신에 인터페이스 구현 방식으로 한다면 여러개를 상속받거나 구현할 수 있음
		
//		ThreadExtends t1 = new ThreadExtends("🩵");
//		ThreadExtends t2 = new ThreadExtends("💚");
//		
//		t1.run();
//		t2.run();
//		t1.start();
//		t2.start();
		
		//Thread 만들기 2번 - interface 구현
		//runable interface를 구현하여 사용한다.
		//다중상속이 가능해짐(상속을 따로 받을 수 있음, 인터페이스 구현도 가능하다)
		ThreadImplements ti1 = new ThreadImplements("🩵");
		ThreadImplements ti2 = new ThreadImplements("💚");
		
		//single thread -> thread program을 구현할 때 run을 쓰면 안됨
//		ti1.run();
//		ti2.run();
		
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		t1.start();
		t2.start(); //multi thread
		System.out.println("메인 쓰레드 끝");
	}
}
