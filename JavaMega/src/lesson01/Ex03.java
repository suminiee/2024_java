package lesson01;

public class Ex03 {
	public static void main(String[] args) {
		//자료형 -> data type 변환 : casting
//		double->int
		double d = 4.7;
		int i = (int)d;
		System.out.println(i);
//		int->double
//		d = (double)i;
//		System.out.println(d);
		System.out.println((double)i);
		
		int number = 7;
		double result = number%2;
		System.out.println(result);
//		소수점이 날라가지 않게 하려면
		result = (double)number/2;
		System.out.println(result);
		
//		반올림
//		Math.round(소수);	=>정수 / 첫째자리에서 반올림
		System.out.println(Math.round(3.6642));
		
//		소수 둘째자리까지 반올림
		double pi = 3.141592653; 
		System.out.println(Math.round(pi*100));
		System.out.println(Math.round(pi*100)/100.0);
		
	}
}
