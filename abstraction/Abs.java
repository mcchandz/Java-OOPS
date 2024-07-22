package abstraction;

public class Abs {
	public static void main(String[] args) {
		Emp e = new Person();
		e.work();
	}
}
abstract class Emp{
	abstract void work();
}
class Person extends Emp{
	void work() {
		System.out.println("working");
	}
}
