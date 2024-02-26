package lesson14;

public class CmToInch extends Converter{
	public CmToInch() {
		super.ratio = 0.393701;
	}
	protected void printConverted() {
		System.out.println(super.result + "inch");
	}
	
}
