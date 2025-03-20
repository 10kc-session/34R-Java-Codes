package com.constructor;

public class Student {
	private String studentName;
	private int studentRollno;
	private String studentDept;
	
//	Parameterized constructor
	public Student(String studentName, int studentRollno , String studentDept) {
		System.out.println("Parameterized constructor is inkoved");
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.studentDept = studentDept;
	}
	
	public void displayDetails() {
		System.out.println("Student Name : " + this.studentName);
		System.out.println("Student rollno : "  + this.studentRollno);
		System.out.println("Student Dept : " + this.studentDept);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Akhil" , 216 , "EEE");
		student1.displayDetails();
		
		Student student2 = new Student("Deepika" , 24 , "ECE");
		student2.displayDetails();
	}
	
}





