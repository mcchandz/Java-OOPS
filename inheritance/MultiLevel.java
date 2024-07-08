package inheritance;

import java.util.Scanner;

public class MultiLevel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name and USN: ");
		String name = sc.next();
		String usn = sc.next();
		
		Student s = new Student();
		s.view();
		System.out.println("Your name is "+name+" and USN is "+usn);

  }
}
class BE{
	String clg = "GECH";
	void college() {
		System.out.println("College name is "+clg);
	}
}
class Branch extends BE{
	Scanner sc = new Scanner(System.in);
	void choice() {
		System.out.println("Enter your branch choice:\n1.CSE\n2.ECE");
		int ch = sc.nextInt();
		super.college();
		if(ch==1) {
			System.out.println("Your branch is CSE");
		} else {
			System.out.println("Your branch is ECE");
		}
		
	}
}
class Student extends Branch{
	void view() {
		super.choice();
	}
	}

