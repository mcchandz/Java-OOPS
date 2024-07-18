package polymorphism;

class Father{
	int age = 55;
}
class Son extends Father{
	int ageSon = 22;
}
public class Upcasting {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.age);
	}

}
