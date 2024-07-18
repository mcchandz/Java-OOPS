package polymorphism;

public class TypeCasting {
	public static void main(String[] args) {
		int a = 10;
		double b = a;    //widening
		System.out.println(a+" "+b);
		
		double c = 10.678;
		int d = (int)c;      //narrowing
		System.out.println(c+" "+d);   	
	}

}
