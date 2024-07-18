package polymorphism;

public class CompileTime {
	public static void main(String[] args) {
		CompileTime c = new CompileTime();
		c.display(22);
		c.display("Chandu");
		c.display(22, "MC");
	}
	
	void display(int age) {
		System.out.println(age);
	}
	void display(String name) {
		System.out.println(name);
	}
	void display(int age, String name) {
		System.out.println(age+" "+name);
	}
}

