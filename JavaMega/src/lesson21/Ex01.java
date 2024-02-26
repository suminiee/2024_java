package lesson21;

public class Ex01 {
	public static void main(String[] args) {
		//예외처리(exception) : 예상치 못한 상황에 대비(런타임 에러)
		//try - catch - finally
		
		//배열 범위 참조 오류
		try {
			int[] arr = new int[3];
			System.out.println(arr[3]);
			
			//NPE(NullPointerException)
			String str = null;
			System.out.println(str.isBlank());//NPE발생
			
			//casting exception
			Object x = new Integer(5);//upcasting
			System.out.println((Integer)x);//downcasting
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 참조 오류 발생");
			e.printStackTrace();//원래 찍히던 에러 볼 수 있고 정상적으로 수행도 됨
		} catch	(NullPointerException npe) {
			System.out.println("NPE발생");
		} catch (Exception e) {
			System.out.println("모든 예외를 다 잡는다.");
		} finally {
			System.out.println("예외이든 아니든 무조건 불려진다.");
		}
		
		
		
		
		System.out.println("메인 메소드 끝");
	}
}
