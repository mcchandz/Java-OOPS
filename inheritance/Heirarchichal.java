package inheritance;

public class Heirarchichal {	
	public static void main(String[] args) {
		B b = new B();
		b.show();
		C c = new C();
		c.dis();
	}
}
class A{
	void view() {
		System.out.println("This is class A - super class");
	}
}
class B extends A{
	void show() {
		super.view();
		System.out.println("This is class B - sub class");
	}
}
class C extends A{
	void dis() {
		super.view();
		System.out.println("This is class C - sub class");
	}
}
