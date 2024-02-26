package lesson11;

public class TrumpCard {
	private int number;
	private String shape;
	
	public TrumpCard(int number, String shape) {
		this.number = number;
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "TrumpCard [number=" + number + ", shape=" + shape + "]";
	}
	
	
}
