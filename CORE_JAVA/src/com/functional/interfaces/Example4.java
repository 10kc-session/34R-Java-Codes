
package com.functional.interfaces;

import java.util.function.Function;

class X implements Function<String , Boolean>{
	public Boolean apply(String str) {
		return str.length() > 5;
	}
}
class Student{
	private String studentName;
	private Integer rollNo;
	public Student(String studentName, Integer rollNo) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + "]";
	}
}
public class Example4 {
	public static void main(String[] args) {
		Function<String , Boolean> function = new X();
		System.out.println(function.apply("Hello World"));
		
		
		Function<String , String> toUpperCase = new Function<String , String>(){
			public String apply(String str) {
				return str.toUpperCase();
			}
		};
		System.out.println(toUpperCase.apply("java is awesome and torture"));
		
		Function<Student , String> getName = new Function<Student , String>(){
			public String apply(Student st) {
				return st.getStudentName();
			}
		};
		
		System.out.println(getName.apply(new Student("Vishnu" , 46)));
		
	}
}





