package assignment2;

public class MethodOverload {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(int a, double b) {
		return a+b;
	}
	public double add(double a, int b, double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		System.out.println(mo.add(2, 4));
		System.out.println(mo.add(2, 2.578));
		System.out.println(mo.add(2, 4, 6));
		System.out.println(mo.add(8.987, 5, 9.098));
	}

}
