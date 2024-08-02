package libraries;

public class Equals {
	Employee emp = new Devloper();
	static void display(Employee emp) {
		emp.work();
	}
	public static void main(String[] args) {
		display(new Devloper());
		display(new Tester());
		
		System.out.println("-----------------------------------------------------------------");
		//specialization
		Employee e1 = new Devloper();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		
		System.out.println("-----------------------------------------------------------------");
		//generalization
		Employee emp;
		emp = new Devloper();
		emp.work();
		emp = new Tester();
		emp.work();
	}

}
class Employee {
	void work() {
		System.out.println("working");
	}
}
class Devloper extends Employee {
	@Override
	void work() {
		System.out.println("developing app");
	}
}
class Tester extends Employee {
	@Override
	void work() {
		System.out.println("testing app");
	}
}


