package lesson12;

public class HealthRate extends HealthInfo{
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	//비만도 계산 클래스
//	표준체중:SW=(H-100)*0.9
//	비만도: B(%)=(W-SW)/SW * 100

	public double circulateSw() {
		double sw = (super.height - 100)*0.9;
		return sw;
	}
	
	public double circulateB() {
		double b = (super.weight - this.circulateSw())/this.circulateSw()*100;
		return b;
	}
	
	public void printHealthRate() {
		if (this.circulateB() < 10) {
			System.out.println(super.name + "님의 신장 " + super.height + ", 몸무게 " + super.weight + " => 정상입니다.");
		}
		else if (this.circulateB() < 20) {
			System.out.println(super.name + "님의 신장 " + super.height + ", 몸무게 " + super.weight + " => 과체중입니다.");
		}
		else {
			System.out.println(super.name + "님의 신장 " + super.height + ", 몸무게 " + super.weight + " => 비만입니다.");
		}
		
	}
	
}
