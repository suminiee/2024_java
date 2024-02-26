package lesson11;

import java.util.Random;

public class TrumpCardDeck {
	TrumpCard[] cards = new TrumpCard[52];
	
	public TrumpCardDeck() {
		makeDeck();
	}
	
	private void makeDeck() {
		String[] shapes = {"diamond", "heart", "spade", "clover"};
		
		int Index = 0;
		
		for (int i = 0; i < shapes.length; i++) {
			for (int j = 1; j < 14; j++) {
				cards[Index] = new TrumpCard(j, shapes[i]); //배열에 객체를 하나씩 넣어줌.
				Index++;
			}
		}
	}
	
	public void suffle() {
		Random rand = new Random();

		// 0번째 index와 random index와 교체를 1000번 반복해서 뒤섞는다.     
		for (int i = 0; i < 1000; i++) {
		    int randIndex = rand.nextInt(52); // 0~51중에 하나 뽑기
		   
		    TrumpCard temp = cards[randIndex];
		    cards[randIndex] = cards[0];
		    cards[0] = temp;
		    
		}
	}
	
	public void printDeck() {
		for(int i = 0; i < this.cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}
