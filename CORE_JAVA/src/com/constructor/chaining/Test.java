package com.constructor.chaining;

//class Person{

//	private long id;
//	public String name;
//	protected int age;
//}
//class Employee extends Person{
//	
//}
//class Manager extends Employee{
//	
//}
//public class Test {
//	public static void main(String[] args) {
////		Manager manager = new Manager();
////		System.out.println(manager.age);
////		System.out.println(manager.name);
////		System.out.println(manager.id);
//		
//		Employee employee = new Employee();
////		System.out.println(employee.id);
//		System.out.println(employee.name);
//		System.out.println(employee.age);
//	}
//}

class Employee {
	String name; // suresh
	int id; // 101
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Manager extends Employee {
	String department; // Testing
	public Manager(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}
}

class Director extends Manager {
	double budget; // 5500000
	public Director(String name, int id, String deparment, double budget) {
		super(name, id, deparment);
		this.budget = budget;
	}
}

public class Test {
	public static void main(String[] args) {
		Director director = new Director("Suresh", 101, "Testing", 550000.3033);
		System.out.println(director.name);
		System.out.println(director.id);
		System.out.println(director.department);
		System.out.println(director.budget);
	}
}
