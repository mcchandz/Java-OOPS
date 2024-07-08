package constructorandarrays;

public class Main {
	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee(123, "ABC", 60000);
		emp[1] = new Employee(456, "XYZ", 55000);
		emp[2] = new Employee(789, "PQR", 45000);
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Employee ID= "+emp[i].id+" ,Employee Name= "+emp[i].name+" and Employee Salary= "+emp[i].sal);
		}	
	}

}
class Employee{
	int id;
	String name;
	int sal;
	
	Employee(int id, String name, int sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}
