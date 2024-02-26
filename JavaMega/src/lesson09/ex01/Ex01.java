package lesson09.ex01;

public class Ex01 extends ScoreData{
	public static void main(String[] args) {
		ScoreData sd = new ScoreData();
		sd.subject = "과학";
		sd.score = 96;
		sd.grade = 1;
		
		System.out.println(sd.toString());
	}
}
