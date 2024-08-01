package access_specifier;

public class SamePublic {
	public String n = "Hii";
	public static void main(String[] args) {
		SamePublic sp = new SamePublic();
		System.out.println(sp.n);
		sp.access();
	
	}
	public void access() {
		System.out.println("Same class");
	}
}


