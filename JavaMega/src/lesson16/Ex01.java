package lesson16;

import java.nio.file.spi.FileSystemProvider;

public class Ex01 {
	public static void main(String[] args) {
//		1. 기본 자료형(Primitive type)
		int n1 = 5;
		System.out.println(n1);
		
//		2. Wrapper 클래스
		Integer n2 = 5;
		System.out.println(n2);
		
//		3. Wrapper 클래스(2)
		Integer n3 = new Integer(5); //쓰지말라고 경고하는거임
		System.out.println(n3);
		
		System.out.println(n1 == n2);//true
		System.out.println(n1 == n3);//true
		System.out.println(n2 == n3);//false
		System.out.println(n2.equals(n3));//true
		
//		new로 Integer를 만드는 행위만 안하면 됨.
	}
}
