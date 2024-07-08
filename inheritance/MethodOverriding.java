package inheritance;

public class MethodOverriding {
	public static void main(String[] args) {
		Peacock p = new Peacock();
		Hen h = new Hen();
		p.dis();
		System.out.println("--------------------------------------");
		p.dis("Parrot");
		System.out.println("--------------------------------------");
		h.show();
	}
}
class Bird{
	void fly() {
		System.out.println("All birds can fly except few");
	}
	void fly(String name) {
		System.out.println(name+" may or may not fly");
	}
}
class Peacock extends Bird{
	void dis() {
		super.fly();
		System.out.println("Peacock is our national bird");
	}
	void dis(String name) {
		super.fly(name);
		System.out.println(name+"is a beautiful bird");
	}
}
class Hen extends Birds{
	void show() {
		super.nest();
		System.out.println("This is class hen");
	}
}

