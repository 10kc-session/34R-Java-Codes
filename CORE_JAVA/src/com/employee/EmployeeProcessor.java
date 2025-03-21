package com.employee;

public class EmployeeProcessor {
	public static void main(String[] args) {
		

		Employee employee = new Employee(141, "Hemanth");
		System.out.println("Employee Id : " + employee.getEmpId());
		System.out.println("Employee Name : " + employee.getName());
		System.out.println("Employee Desg : " + employee.getDesignation());
		System.out.println("Employee Salary : " + employee.getSalary());
		System.out.println("Employee Rating : " + employee.getPerformanceRating());
		
		
		Employee employee3 = new Employee(1234, "Raghu");
		System.out.println("Employee Id : " + employee3.getEmpId());
		System.out.println("Employee Name : " + employee3.getName());
		System.out.println("Employee Desg : " + employee3.getDesignation());
		System.out.println("Employee Salary : " + employee3.getSalary());
		System.out.println("Employee Rating : " + employee3.getPerformanceRating());
		
		System.out.println("****************************************");
		
		Employee employee1 = new Employee(1, "Divya", "SD", 50000, 5);
		System.out.println("Employee Id : " + employee1.getEmpId());
		System.out.println("Employee Name : " + employee1.getName());
		System.out.println("Employee Desg : " + employee1.getDesignation());
		System.out.println("Employee Salary : " + employee1.getSalary());
		System.out.println("Employee Rating : " + employee1.getPerformanceRating());
		
		employee1.promoteEmployee("SE"); // promoting employee basis of rating
		
		System.out.println("****** After Promoting********");
		System.out.println("Updated Salary : " + employee1.getSalary());
		System.out.println("New Designation : " + employee1.getDesignation());
		
		System.out.println("********************************");
		
		Employee employee2 = new Employee(2, "Manideep", "Software Dev", 75000, 3);
		System.out.println("Employee Id : " + employee2.getEmpId());
		System.out.println("Employee Name : " + employee2.getName());
		System.out.println("Employee Desg : " + employee2.getDesignation());
		System.out.println("Employee Salary : " + employee2.getSalary());
		System.out.println("Employee Rating : " + employee2.getPerformanceRating());
		
		employee2.promoteEmployee("SE"); // promoting employee basis of rating
		
		System.out.println("****** After Promoting********");
		System.out.println("Updated Salary : " + employee2.getSalary());
		System.out.println("New Designation : " + employee2.getDesignation());
	}
}
