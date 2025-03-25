package com.company;

public class Manager {
	private String managerName;

	/**
	 * @param managerName
	 */
	public Manager(String managerName) {
		this.managerName = managerName;
		System.out.println("Manager object is created...");
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	/**
	 * 
	 * @param employee
	 * if employee salary is greater than 10000 then increment 15% of his/her sal
	 * if employee salary is greater than 30000 then increment 10% of his/her sal
	 * if employee salary is greater than 50000 then increment 5% of his/her sal
	 * 
	 */
	public void checkEmployeeDetails(Employee employee) {
		System.out.println("Employee Name : " + employee.getEmployeeName());
		System.out.println("Employee Salary : " + employee.getEmployeeSalary());
		System.out.println("Employee Desgination : " + employee.getEmployeeDesg());
		
		double salary = employee.getEmployeeSalary();
		
		if(salary > 10000 && salary < 30000) {
			employee.setEmployeeSalary(salary +(salary * 0.15));
		}
		else if(salary >= 30000 && salary < 50000) {
			employee.setEmployeeSalary(salary + (salary * 0.10));
		}
		else if (salary >= 50000) {
			employee.setEmployeeSalary(salary + (salary * 0.5));
		}
		else {
			System.out.println("No Increment");
			return;		
		}
		System.out.println("Your Updated Salary " + employee.getEmployeeSalary());
	}

	
}
