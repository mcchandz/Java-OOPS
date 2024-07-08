package inheritance;

class Birds{
	void nest() {
		System.out.println("All birds build nest");
	}
}

class Parrot extends Birds {
	void beak() {
		super.nest();
		System.out.println("Parrot has red beak");
	}
}

public class Single {
	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.beak();
	}

}
