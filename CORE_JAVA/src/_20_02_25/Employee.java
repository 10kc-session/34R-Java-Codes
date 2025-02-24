package _20_02_25;

public class Employee {
	
	String empName;
	String empDesg;
	double empSalary;
	
	public void displayDetails() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Designation : "+empDesg);
		System.out.println("Employee Salary : "+empSalary);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.empName = "Ravali";
		emp1.empDesg = "SE";
		emp1.empSalary = 45000.00;
		emp1.displayDetails();
		
		System.out.println("--------emp2----------");
		
		emp2.empName = "Ameer";
		emp2.empDesg = "SE";
		emp2.empSalary = 45000.00;
		emp2.displayDetails();
	}
}




