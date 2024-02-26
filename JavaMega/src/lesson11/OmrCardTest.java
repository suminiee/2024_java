package lesson11;

public class OmrCardTest {
	public static void main(String[] args) {
		OmrCard omr1 = new OmrCard("신보람", "20200302");
		omr1.insertAnswer();
		
		OmrCardReader omrr1 = new OmrCardReader(1, 2, 3, 4, 5);
		omrr1.print(omr1);
		
	}
}
