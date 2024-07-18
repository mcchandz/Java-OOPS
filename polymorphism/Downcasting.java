package polymorphism;

class Father1{
	int age = 55;
}
class Son1 extends Father1{
	int ageSon = 22;
}
public class Downcasting {
	public static void main(String[] args) {
		Father1 f = new Son1();
		Son1 s = (Son1)f;     
		
		System.out.println(f.age);
		System.out.println(s.ageSon);
	}

}
