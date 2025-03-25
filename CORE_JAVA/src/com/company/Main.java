package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee name : " );
		String employeeName = scanner.nextLine();
		
		System.out.print("Enter employee id : ");
		int employeeId = scanner.nextInt();
		
		System.out.print("Enter employee salary : ");
		double employeeSalary = scanner.nextDouble();
		
		scanner.nextLine(); // empty scanner to take new line from nextDouble and nextInt;
		
		System.out.print("Enter employee desg : ");
		String employeeDesg = scanner.nextLine();
		
		Employee employee = new Employee(employeeName, employeeId, employeeSalary, employeeDesg);
				
		System.out.print("Enter Manager Name : ");
		
		String managerName = scanner.nextLine();
		
		Manager manager = new Manager(managerName);
		
		manager.checkEmployeeDetails(employee);
		
		scanner.close();
	}

}
