package com.abstraction;


abstract class Employee{
	String employeeName;
	String employeeId;
	
	public Employee(String employeeName, String employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	abstract void calculateSalary();
	
	public void applyLeave() {
		System.out.println("Leave applied successfully.");
	}
	
	public void getDetails() {
		System.out.println("Employee Details : " + employeeName + ", Id : "+employeeId);
	}
	
}
class FullTimeEmployee extends Employee{

	Double basePay , benefits;
	
	public FullTimeEmployee(String employeeName, String employeeId , Double basePay , Double benefits) {
		super(employeeName, employeeId);
		this.basePay = basePay;
		this.benefits = benefits;
	}

	@Override
	void calculateSalary() {
		System.out.println("Calculating salary: Base pay + benefits = "+ "$" + (basePay + benefits));
	}
	
}

class PartTimeEmployee extends Employee{
	Integer hourlyRate , hoursWorked;

	public PartTimeEmployee(String employeeName, String employeeId , Integer hourlyRate ,Integer hoursWorked) {
		super(employeeName, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	void calculateSalary() {
		System.out.println("Calculating salary: Hours worked × rate = $" + (hourlyRate * hoursWorked));
	}
	
}

public class Main {
	public static void main(String[] args) {
		Employee emp ;
		emp = new FullTimeEmployee("Madhu", "123", 55000.00, 10000.00);
		emp.calculateSalary();
		emp.getDetails();
		emp.applyLeave();
		
		System.out.println("----------------------------");
		
		emp = new PartTimeEmployee("Sunitha", "1234", 5000, 2);
		emp.calculateSalary();
		emp.getDetails();
		emp.applyLeave();
		
	}
}
