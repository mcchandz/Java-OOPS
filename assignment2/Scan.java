package assignment2;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the following details: Number in int, float, double, byte, short, long, String");
		int num = sc.nextInt();
		float num1 = sc.nextFloat();
		double num2 = sc.nextDouble();
		byte b = sc.nextByte();
		short s = sc.nextShort();
		long l = sc.nextLong();
		String name = sc.next();
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(name);
	}

}
