package constructorchaining;

public class Chaining {
	Chaining(int age){
		System.out.println("Age:"+age);
	}
	Chaining(String name){
		this(22);
		System.out.println("Name: "+name);
	}
	Chaining(String name, int age){
		this("MC");
		System.out.println("Name is: "+name+" age: "+age);
	}
	public static void main(String[] args) {
		new Chaining("Chandu", 22);
	}
}
