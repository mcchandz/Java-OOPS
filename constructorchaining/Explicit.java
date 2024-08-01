package constructorchaining;

public class Explicit {
	public static void main(String[] args) {
		new C("green");
		new D(10);
	}
}
class C{
	C(String color){     
		System.out.println(color);
	}
}
class D extends C{
	D(int num){           
		super("red");             
		System.out.println(num);
	}
}