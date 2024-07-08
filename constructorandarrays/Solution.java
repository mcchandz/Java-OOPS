package constructorandarrays;

public class Solution {
	public static void main(String[] args) {
	Student[] stu = new Student[2];
	stu[0] = new Student(22, "Chandu");
	stu[1] = new Student(20, "Rajath");
	
	for(int i=0;i<stu.length;i++) {
		System.out.println("Name "+stu[i].name+" and age "+stu[i].age);
	}
	}
}
class Student{
	int age;
	String name;
	
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}	
}
