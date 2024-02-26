package lesson15;

public class Test {
	public static void main(String[] args) {
		EntertainerApplicant soo = new EntertainerApplicant();
		
		// 지원할 곳 (JYP)
	    JypEntertainment jyp = new JypEntertainment();
	    jyp.actorAudition(soo);
	    jyp.idolAudition(soo);
		
	}
}
