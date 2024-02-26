package lesson20;

public class Quiz01 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		ThreadAnimal t1 = new ThreadAnimal("음메~");
		ThreadAnimal t2 = new ThreadAnimal("어흥");
		ThreadAnimal t3 = new ThreadAnimal("히잉");
		
		Thread cow = new Thread(t1);
		Thread tiger = new Thread(t2);
		Thread horse = new Thread(t3);
		
		tiger.start();
		cow.start();
		tiger.join();
		cow.join();
		horse.start();
		
	}
}
