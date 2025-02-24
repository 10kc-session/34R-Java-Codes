package com.student.blc.elc;

// ELC -> Executable logic Class
public class StudentMainClass {
	
	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentName("Yamini");
		st.setStudentBranch("MCA");
		st.setStudentId(121);
		st.setStudentCollege("XYZ");

		System.out.println("---------Student Details----------");
		System.out.println(st.displayDetails());
		
		System.out.println("Student Name : " + st.getStudentName());
	}
}
