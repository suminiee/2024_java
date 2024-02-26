package lesson01;

public class Quiz02 {
	public static void main(String[] args) {
//		1번
		int score = 90;
		char grade = 'A';
		double num = 4.0;
		
		System.out.println("시험 성적이 " + score + "점 이상이면 '" + grade +"'학점이고 평점은 " + num + "입니다.");
		score = 80;
		grade++;
		num = 3.0;
		System.out.println("시험 성적이 " + score + "점 이상이면 '" + grade +"'학점이고 평점은 " + num + "입니다.\n");

//		2번
		int number1 = 33;
		double number2 = 35.325;
		double result = number1*number2;
		System.out.println("두 수의 곱 : " + result);
		System.out.println();
		
//		3번
//		943시간은 39일 7시간 입니다.
		int time = 943;
		int day = time/24;
		int hour = time%day;
		System.out.printf("%d시간은 %d일 %d시간 입니다.\n\n", time, day, hour);
		
		
//		4번
		int width = 8;
		int height = 9;
		int rectArea = width*height;
		int triArea = width*height/2;
		
		System.out.println("사각형의 넓이 : " + rectArea);
		System.out.println("삼각형의 넓이 : " + triArea);
		
	}

}
