package com.functional.interfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employeee{
	private String employeeName , employeeDesg;
	private Double employeeSalary;
	public Employeee(String employeeName, String employeeDesg, Double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDesg = employeeDesg;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesg() {
		return employeeDesg;
	}
	public void setEmployeeDesg(String employeeDesg) {
		this.employeeDesg = employeeDesg;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employeee [employeeName=" + employeeName + ", employeeDesg=" + employeeDesg + ", employeeSalary="
				+ employeeSalary + "]";
	}
}

public class Example3 {
	public static void main(String[] args) {
		Predicate<Employeee> check = new Predicate<Employeee>() {
			public boolean test(Employeee emp) {
				return emp.getEmployeeSalary() > 10000;
			}
		};
		Consumer<Employeee> consumer = new Consumer<Employeee>() {
			public void accept(Employeee employee) {
				System.out.println(employee);
			}
		};
		
		Supplier<String> sup = new Supplier<String>() {
			public String get() {
				return "Hello World";
			}
		};
		System.out.println(sup.get());
		
		Supplier<Employee> employeeProvider = new Supplier<Employee>() {
			public Employee get() {
				return new Employee("Random");
			}
		};
		System.out.println(employeeProvider.get());
		
		
		
		
//		Employeee employee1 = new Employeee("X", "Y", 25000.123);
//		Employeee employee2  = new Employeee("A" , "B" , 30000.122);
//		Employeee employee3 = new Employeee("C" , "D" , 1000.454);
//		
//		Employeee [] employees = {employee1 , employee2 , employee3};
//		
//		for(Employeee emp : employees) {
//			if(check.test(emp)) {
//				emp.setEmployeeSalary(emp.getEmployeeSalary() + (emp.getEmployeeSalary() * 0.1));
//				consumer.accept(emp);
//			}
//		}
		
	}
}






