package libraries;

public class Equals {
	public static void main(String[] args) {
		student s1 = new student(50);
		student s2 = new student(60);
		System.out.println(s1.equals(s2));
	}
}
class student {
	int marks;
	student(int marks) {
		this.marks = marks;
	}
	@Override
	public boolean equals(Object obj) {
		student s = (student) obj;
		return this.marks == s.marks;
	}
}


