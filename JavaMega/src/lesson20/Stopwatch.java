package lesson20;

public class Stopwatch extends Thread{
	private boolean stop;//stop flag
	
	@Override
	public void run() {
		long time = System.currentTimeMillis();
		long startTime = System.currentTimeMillis();
		while(!stop) {
			time = System.currentTimeMillis();
		}
		
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
