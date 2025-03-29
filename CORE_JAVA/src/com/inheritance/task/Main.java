package com.inheritance.task;

public class Main {
	public static void main(String[] args) {
		Institute institute1 = new Institute("Java", 30000);
		Institute institute2 = new Institute("Python", 30000);
		Institute institute3 = new Institute("AI & ML", 50000);
		
		
		Student student = new Student("Suresh", "EEE", institute1, new Address("hyd", 500032, "xyz", "Tg"));
		System.out.println(student.getName());
		System.out.println(student.getBranch());
		System.out.println(student.getInstitute().getCourse());
		System.out.println(student.getInstitute().getFees());
		System.out.println(student.getAddress().getCity());
		System.out.println(student.getAddress().getPincode());
		System.out.println(student.getAddress().getStreet());
		
		
//		Address address = new Address("Hyderadab", 500050, "Chandanagar", "TS");
//		
//		Student student = new Student("VengaMamba", "CSE", institute1 , address);
//		System.out.println(student.getName());
//		System.out.println(student.getBranch());
//		System.out.println(student.getInstitute().getCourse());
//		System.out.println(student.getInstitute().getFees());
//		System.out.println(student.getAddress().getCity());
//		System.out.println(student.getAddress().getPincode());
//		System.out.println(student.getAddress().getStreet());
//		
//		student.setInstitute(institute1);
//		
//		System.out.println("------ I have Joined insititute -------");
//		
//		System.out.println(student.getInstitute().getCourse());
//		System.out.println(student.getInstitute().getFees());
//		
//		System.out.println("----- I have changed institute ------");
		
//		student.setInstitute(institute2);
//		
//		System.out.println(student.getInstitute().getCourse());
//		System.out.println(student.getInstitute().getFees());
		
		
	}
}
