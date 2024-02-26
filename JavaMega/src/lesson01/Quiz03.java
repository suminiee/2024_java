package lesson01;

public class Quiz03 {
	public static void main(String[] args) {
//		1번
		int kor = 93;
		int math = 88;
		int eng = 94;
		double average = (double)(kor + math + eng) / 3;
		
		System.out.printf("국어 %d점, 수학 %d점, 영어 %d점\n", kor, math, eng);
		System.out.println("평균 : "+(Math.round(average * 100)) / 100.0);
		
//		2번
//		화씨 온도 = 9 / 5 * 섭씨온도 + 32
		int c = 30;
		double f = 9.0 / 5 * c + 32;
//		double f = (double)9/5*c+32;
		System.out.println("섭씨 30도는 화씨 " + f + "도 입니다.");
	}

}
