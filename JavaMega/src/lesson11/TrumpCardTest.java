package lesson11;

/*
 트럼프 카드를 만들고 섞은 후 잘 섞였는지 확인하는 프로그램
* 스페이드(spade), 하트(heart), 다이아몬드(diamond), 클로버(club) 네 가지의 모양이 있다.
* 각 모양별로 13장의 카드가 있다.(1~13까지의 번호로 저장)
* 카드를 랜덤으로 섞는다.
* 섞는 방법 힌트: 총 52장의 카드가 들어있는 배열에서 index 0번째 카드와 랜덤한 index번째 카드와의 교환(swap)을 1,000회 하여 섞는다.
* 카드들이 잘 섞여졌는지 전체 출력한다.
힌트: 트럼프 카드 객체는 '한 장'이며 모양과 숫자를 넣어주고, 카드를 섞는 것은 사용자다.
*/

public class TrumpCardTest {
	public static void main(String[] args) {
		TrumpCardDeck tc = new TrumpCardDeck();
		tc.printDeck(); //제대로 카드 객체 만들어진거 확인
		tc.suffle(); //무작위로 섞이게 함
		System.out.println();
		tc.printDeck(); //섞인 덱 프린트
		
	}
}
