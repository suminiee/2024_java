package lesson14;

public class DollerToWon extends Converter{
	public DollerToWon(int doller) {
		super.ratio = doller;
	}
	protected void printConverted() {
		System.out.println(super.result + "원");
	}
}
