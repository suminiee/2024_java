package lesson20;

import java.util.Scanner;

public class StopwatchMain {
	public static void main(String[] args) {
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		Scanner sc = new Scanner(System.in);
		String insert = sc.next();
		Stopwatch st1 = new Stopwatch();
		if (insert == "시작") {
			st1.start();
		}
		insert = sc.next();
		if (insert == "그만") {
			st1.setStop(true);;
		}
		sc.close();
	}
}
