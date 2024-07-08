package inheritance;

public class Hybrid {
	public static void main(String[] args) {
		Aquatic aq = new Aquatic();
		aq.live();
		System.out.println("-------------------------------------------------");
		Terrestrial t = new Terrestrial();
		t.live();
		System.out.println("-------------------------------------------------");
		Amphibians am = new Amphibians();
		am.live();
	}

}
class Animal{
	void eat() {
		System.out.println("All animals eat");
	}
}
class Aquatic extends Animal{
	void live() {
		super.eat();
		System.out.println("Aquatic animals live in water");
	}
}
class Terrestrial extends Animal{
	void live() {
		super.eat();
		System.out.println("Terrestrial animals live on land");
	}
}
class Amphibians extends Aquatic{
	void live() {
		super.live();
		System.out.println("Amphibians are also aquatic animals and also live on land");
	}
}
