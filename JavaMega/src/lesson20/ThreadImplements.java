package lesson20;

public class ThreadImplements implements Runnable {
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		//여기서 구현하는 내용이 쓰레드에서 실행되는 내용
		
				//리소스 10번 출력
				for (int i = 0; i < 10; i++) {
					System.out.println(this.resource);
					try {
						Thread.sleep(300);//0.3초 쉬고
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		
	}
	
}
