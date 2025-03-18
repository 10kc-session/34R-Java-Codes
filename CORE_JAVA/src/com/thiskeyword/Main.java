package com.thiskeyword;

// ELC
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("Hemanth");
		employee.setEmployeeDesg("Trainer");
		
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeDesg());
	}
}
