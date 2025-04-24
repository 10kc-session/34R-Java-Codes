package com.functional.interfaces;

import java.util.function.Consumer;

class Demo implements Consumer<String>{
	@Override
	public void accept(String str) {
		System.out.println(str);
	}
}

class Employee{
	private String employeeName;
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + "]";
	}
}

public class Example1 {
	public static void main(String[] args) {
		Consumer<String> consumer = new Demo();
		consumer.accept("Java is Awesome");
		
		Consumer<String> consumer2 = new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		};
		consumer2.accept("Javascript is Awesome");
		
		Consumer<Integer> consumer3 = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println("Integer value : " + i);
			}
		};
		consumer3.accept(30);
		
		Consumer<Employee> consumer4 = new Consumer<Employee>() {
			public void accept(Employee emp) {
				System.out.println(emp);
			}
		};
		consumer4.accept(new Employee("Ravi"));
	}
}






