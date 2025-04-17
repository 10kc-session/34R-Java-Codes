package com.arrays;

class Student{
	int rollNo;
	String name;
	int [] marks; // new int[] {45 , 54 , 32 , 54 ,67} // marks = [45 , 54 ,32 , 54 ,67]
	public Student(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public double calculateAverage() {
		double sum = 0;
		for(int ele : marks) {
			sum += ele; // 252 -> 45 + 54 + 32 + 54 + 67 
		}
		return sum/marks.length;
	}
	public String displayDetails() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ",Average marks=" + calculateAverage() + "]";
	}
	
}

 class Employee{
	int empId;
	String empName;
	double [] monthlySalaries;
	
	public Employee(int empId , String empName , double [] monthlySalaries){
		this.empId = empId;
		this.empName = empName;
		this.monthlySalaries = monthlySalaries;
	}
	
	public double calculateAnnualSalary(){
		double totalSalary = 0;
		for(double salary : monthlySalaries){	
			totalSalary += salary;
		}
		return totalSalary;
	}
	
	public void displayEmployeeDetails(){
		System.out.println("Employee id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Annual Salary : "+ calculateAnnualSalary());
	}

	public static void main(String [] args){
		Employee employee1  = new Employee(101 , "John" , new double[]{10000 , 15000 , 10000 , 13000 , 30000 , 12000 , 4000, 7000, 9000 , 3999 , 5000 , 4000} );
		Employee employee2  = new Employee(102 , "John Dao" , new double[]{10000 , 15000 , 10000 , 13000 , 30000 , 12000 , 4000, 7000, 7000 , 3999 , 5000 , 4000} );
	
		Employee [] employees = {employee1 , employee2};
		for(Employee employee : employees){
			employee.displayEmployeeDetails();
		}

	}
}




public class Main {
	public static void main(String[] args) {
		Student student1 = new Student(101 , "Raghu" , new int[] {45 , 54 , 32 , 54 ,67}) ;
		Student student2 = new Student(102 , "Ravi" , new int[] {67 , 54 , 76 , 84 ,67}) ;
		Student student3 = new Student(103 , "Rahul" , new int[] {95 , 74 , 52 , 84 ,57}) ;
		
		Student [] students = {student1 , student2 , student3};
		
		for(Student student : students) {
			System.out.println(student.displayDetails());
		}
	}
}









