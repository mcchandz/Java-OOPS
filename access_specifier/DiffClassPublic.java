package access_specifier;

public class DiffClassPublic {
	public static void main(String[] args) {
		SamePublic sp = new SamePublic();
		System.out.println(sp.n);
		sp.access();
	}

}
