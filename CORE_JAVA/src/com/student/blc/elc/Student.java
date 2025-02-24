package com.student.blc.elc;

// BLC -> Business logic class

public class Student {
	String studentName;
	long studentId;
	String studentBranch;
	String studentCollege;

	public String getStudentName() {
		return studentName;
	}

	public long getStudentId() {
		return studentId;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public String getStudentCollege() {
		return studentCollege;
	}

	public void setStudentName(String stName) {
		studentName = stName;
	}

	public void setStudentId(long id) {
		studentId = id;
	}

	public void setStudentBranch(String stBranch) {
		studentBranch = stBranch;
	}

	public void setStudentCollege(String cname) {
		studentCollege = cname;
	}

	public String displayDetails() {
		return "Student Name : " + getStudentName() + "\nStudent Id : " + getStudentId() + "\nStudent Branch "
			+ getStudentBranch() + "\nStudent College : " + getStudentCollege();
	}
}
