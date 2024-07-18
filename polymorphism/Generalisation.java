package polymorphism;

public class Generalisation {
	public static void main(String[] args) {
		Birds b = new Parrot();
		Birds b1 = new Humming();
		if(b instanceof Parrot) {
			Parrot p = (Parrot)b;
			p.fly();
		}else if(b instanceof Humming) {
			Humming h = (Humming)b;
			h.fly();
		}
		if(b1 instanceof Parrot) {
			Parrot p = (Parrot)b1;
			p.fly();
		}else if(b1 instanceof Humming){
			Humming h = (Humming)b1;
			h.fly();
		}	
	}

}
//overriding
class Birds{
	void fly() {
		System.out.println("All birds fly");
	}
}
class Parrot extends Birds{
	void fly() {
		System.out.println("Parrot is green in color");
	}
}
class Humming extends Birds{
	void fly() {
		System.out.println("Humming bird is the smallest bird");
	}
}