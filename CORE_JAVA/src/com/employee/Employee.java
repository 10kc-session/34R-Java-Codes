package com.employee;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private double salary;
	private int performanceRating;
	
	public Employee() {}
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
		this.designation = "JR SD";
		this.salary = 30000;
		this.performanceRating = 1;
	}
	
	public Employee(int empId, String name, String designation, double salary, int performanceRating) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}

	public void promoteEmployee(String newDesignation) {
		if (performanceRating >= 4) {
			this.salary += (salary * 0.2);
			this.designation = newDesignation;
			System.out.println("Your salary is hiked and promoted");
		} else {
			System.out.println("No promotion");
		}
	}

}
