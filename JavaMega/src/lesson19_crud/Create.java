package lesson19_crud;

import java.util.Scanner;

public class Create {
	private String name;
	private int price;
	private String condition;
	
	public Create() {
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.price = sc.nextInt();
		this.condition = sc.next();
		sc.close();
	}
	
	
}
