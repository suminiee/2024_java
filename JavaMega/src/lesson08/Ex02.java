package lesson08;

public class Ex02 {
	public static void main(String[] args) {
		//자료형 변환
		
		//1. int -> String
		int number1 = 3;
		
		String str1 = number1 + ""; //메모리 공간을 더 필요로 하기 때문에 비효율적, 메모리 낭비
		System.out.println(str1);
		
		//정석적인 방법
		String str2 = String.valueOf(number1);
		System.out.println(str2);
		
		//문자열을 숫자로 변환(산술연산을 하기 위해서 바꿈)
		String str3 = "1234";
		
		int number2 = Integer.valueOf(str3);
		System.out.println(number2);
		//int number3 = 1;
		
	}	
}
