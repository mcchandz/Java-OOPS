package constructorchaining;

public class Implicit {
	public static void main(String[] args) {
		new B();       
	}
}
class A{
	A(){
		System.out.println("This is class A");
	}
}
class B extends A{
	B(){                  
		System.out.println("This is class B");
	}
}