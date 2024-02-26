package lesson12;

public class HealthInfoTest {
	public static void main(String[] args) {
		HealthRate h1 = new HealthRate("박둘리", 160, 45);
		h1.printHealthRate();
		HealthRate h2 = new HealthRate("홍길동", 168, 90);
		h2.printHealthRate();
	}
}
