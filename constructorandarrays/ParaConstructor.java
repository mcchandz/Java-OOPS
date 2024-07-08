package constructorandarrays;

import java.util.Scanner;

public class ParaConstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String n = sc.next();
		new ParaConstructor(n);
	}
	
	public ParaConstructor(String name) {
		System.out.println("Name is: "+name);
	}

}
