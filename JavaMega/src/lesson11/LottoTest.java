package lesson11;

public class LottoTest {
	public static void main(String[] args) {
		//LottoChecker 객체 생성 시 당첨번호가 생성된다
		
		LottoChecker lottoChecker = new LottoChecker();
		
		Lotto lotto1 = new Lotto();
		
		//수동
		lotto1.manual(6, 10, 21, 23, 29, 44);
		lotto1.printLotto();
		lottoChecker.winNumPrint();
		String lottoResult1 = lottoChecker.check(lotto1);
		
		//출력
		System.out.println("수동 등수 : " + lottoResult1);
		
		Lotto lotto2 = new Lotto();
		//자동
		lotto2.auto();
		String lottoResult2 = lottoChecker.check(lotto2);
		System.out.print("자동 ");
		lotto2.printLotto();
		//출력
		System.out.println("자동 등수 : " + lottoResult2);
	}
}
