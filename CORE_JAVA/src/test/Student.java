package test;

public class Student {
	String name;
	double marks;
	public void display() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Marks : " + marks);
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Uttej";
		student.marks = 100.0;
		student.display();
	}
}
