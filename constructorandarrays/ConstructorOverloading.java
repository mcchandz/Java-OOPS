package constructorandarrays;

import java.util.Scanner;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name, age and gender:");
		String name = sc.next();
		int age = sc.nextInt();
		String gen = sc.next();
		
		new ConstructorOverloading(name, age);
		new ConstructorOverloading(name, age, gen);		
	}
	public ConstructorOverloading() {
		System.out.println("Enter the name, age and gender");
	}
	public ConstructorOverloading(String name, int age) {
		System.out.println("Name= "+name+" Age= "+age);
	}
	public ConstructorOverloading(String name, int age, String gen) {
		System.out.println("Name= "+name+" Age= "+age+" Gender= "+gen);
	}

}
