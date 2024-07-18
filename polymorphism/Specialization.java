package polymorphism;

public class Specialization {
	public static void main(String[] args) {
		Animals an = new Dogs();
		an.eat();
		Animals ani = new Cats();
		ani.eat();
		Animals anim = new Animals();
		anim.eat();
	}

}
//overriding
class Animals{
	void eat() {
		System.out.println("All animals eat");
	}
}
class Dogs extends Animals{
	void eat() {
		System.out.println("Dogs eat meat");
	}
}
class Cats extends Animals{
	void eat() {
		System.out.println("Cats drink milk");
	}
}