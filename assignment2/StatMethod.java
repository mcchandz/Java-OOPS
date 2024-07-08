package assignment2;

import java.util.Scanner;

public class StatMethod {
	public static void calculate(int a, int b) {
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		
		System.out.println("Addition: "+add+"\nSubtraction:"+sub+"\nMultiplication:"+mul);
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		StatMethod st = new StatMethod();
		
		StatMethod.calculate(n1, n2);
		st.add(n1, n2);
	}

}
