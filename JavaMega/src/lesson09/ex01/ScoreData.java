package lesson09.ex01;


//설계도, 데이터를 담는 공간의 설계도, 내가 만드는 자료형(data type)
public class ScoreData {
	String subject;
	int score;
	int grade;
	
	
	@Override
	public String toString() {
		return "ScoreData [subject=" + subject + ", score=" + score + ", grade=" + grade + "]";
	}
	
	
	
}
