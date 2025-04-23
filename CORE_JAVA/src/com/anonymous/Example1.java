package com.anonymous;


abstract class Employee {
	abstract String getEmployeeName();
	abstract double getEmployeeSalary();
}

abstract class Vehicle{
	abstract void honk();
}
public class Example1 {
	public static void main(String[] args) {
		Employee employee = new Employee() {
			
			@Override
			double getEmployeeSalary() {
				return 10.0;
			}

			@Override
			String getEmployeeName() {
				return "Hemanth";
			}
			
		};
		
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeSalary());
		
		
		
		
		
		
		
		// Anonymous extends Vehicle
		// Vehicle vehicle = new Anonymous();
		Vehicle vehicle = new Vehicle() {
			@Override
			public void honk() {
				System.out.println("Honking...");
			}
		};
		vehicle.honk();
	}
}
