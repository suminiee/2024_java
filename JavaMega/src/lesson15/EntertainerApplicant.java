package lesson15;

public class EntertainerApplicant implements ShowActSkill, ShowSingSkill{
	private String sing;
	private String act;
	
	public void actSkill() {
		System.out.println("연기 오디션 합격 가능");
	}
	public void singSkill() {
		System.out.println("음치");
	}
}
