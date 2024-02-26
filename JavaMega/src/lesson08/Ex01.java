package lesson08;

public class Ex01 {
	public static void main(String[] args) {
		//String 변수에 값 담기
		String a = "안녕";
		String b = new String("안녕");
		String c = new String("안녕");
		String d = "안녕";
		
		System.out.println(a);
		System.out.println(b);//출력되는 값은 같음
		
		//String끼리 값 비교
		System.out.println(a == d); //true
		System.out.println(b == c); //false
		System.out.println(a == b); //false
		//==으로는 String비교하면 안됨
		
		System.out.println(a.equals(b));//true
		
	}
}
