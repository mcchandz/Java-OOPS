package access_specifier;

public class SamePrivate {
	private String n = "Addition result is: ";
	public static void main(String[] args) {
		SamePrivate sp = new SamePrivate();
		System.out.println(sp.n);
		sp.add(10, 4);
	}
	
	private void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
}
