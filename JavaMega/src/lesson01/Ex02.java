package lesson01;

public class Ex02 {
	public static void main(String[] args) {
		int candy = 350;
		System.out.println("사탕의 가격: " + candy);
		//사탕 세 개의 가격
		int sum = candy*3;
		System.out.println("사탕 가격: " + candy + ", 사탕 세 개의 갸격: " + sum);
		//만원으로 사탕 3개를 산 후 거스름돈 구하기
		int money = 10000;
		int change = money - sum;
		System.out.println("거스름돈: " + change);
		
		//5000원으로 사탕을 몇 개 살 수 있고 거스름돈이 얼마 남는가?
		money = 5000;
		int buyCandy = money/candy;
		System.out.println("5000원으로 살 수 있는 사탕의 개수: " + buyCandy);
		change = money % candy;
		System.out.println("거스름돈: " + change);
	}

}
