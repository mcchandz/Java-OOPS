package polymorphism;

public class RunTime {
	public static void main(String[] args) {
		Animal a = new Dog();          //upcasting
		a.eat();
		Animal b = new Cat();          //upcasting
		b.eat();
		
	}
}
//overriding
class Animal{
	void eat() {
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dogs eat meat");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cats drink milk");
	}
}
