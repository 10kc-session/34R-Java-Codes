package com.constructor;

public class Employee {
	private String employeeName;
	private String employeeDesg;
	private double employeeJoiningBonus;
	
	public Employee() {
		System.out.println("constructor invoked....");
		employeeName = "unknown";
		employeeDesg = "on hold";
		employeeJoiningBonus = 5500.00;
	}	
	
	public static void main(String [] args) {
		Employee obj1 = new Employee();
		System.out.println(obj1.employeeName);
		System.out.println(obj1.employeeDesg);
		System.out.println(obj1.employeeJoiningBonus);
		
		System.out.println("------------------------");
		Employee obj2 = new Employee();
		System.out.println(obj2.employeeName);
		System.out.println(obj2.employeeDesg);
		System.out.println(obj2.employeeJoiningBonus);
	}
}
