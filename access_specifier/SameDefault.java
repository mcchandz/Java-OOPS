package access_specifier;

public class SameDefault {
	public static void main(String[] args) {
		SameDefault sd = new SameDefault();
		sd.add(10, 20);
	}
	
	void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition res of "+a+" and "+b+" is: "+c);	
	}
}
