package polymorphism;

public class Generalisation {
	public static void main(String[] args) {
		Office o = new Lunch();
		       o.time();
		       o = new Break();
		       o.time();
	}
}
class Office{
	void time() {
		System.out.println("Working hours is 9-5");
	}
}
class Lunch extends Office{
	void time() {
		System.out.println("Lunch time is 1-2");
	}
}
class Break extends Office{
	void time() {
		System.out.println("Break time");
	}
}