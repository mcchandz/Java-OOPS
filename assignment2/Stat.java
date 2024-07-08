package assignment2;

public class Stat {
	static {
		int a=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		{
			System.out.println("hi");
		}
	}
	static {
		System.out.println(14);
	}
}
