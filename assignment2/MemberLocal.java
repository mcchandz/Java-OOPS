package assignment2;

import java.util.Scanner;

public class MemberLocal {
	private int id;
	private String name;
	private int age;
	
	public void setID(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void view() {
		System.out.println("ID= "+id+"\nName= "+name+"\nAge= "+age);;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberLocal ml = new MemberLocal();
		ml.setID(1234);
		ml.setName("MC");
		System.out.println("Enter the age: ");
		ml.age = sc.nextInt();
		ml.view();
	}
}
