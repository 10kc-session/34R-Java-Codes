package _21_02_25;

public class Employee {
	String employeeName;
	double employeeSal;
	String employeeDesg;
	long employeeId;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeDesg() {
		return employeeDesg;
	}
	public double getEmployeeSal() {
		return employeeSal;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String name) {
		employeeName = name;
	}
	
	public void setEmployeeDesg(String des) {
		employeeDesg = des;
	}
	
	public void setEmployeeSal(double sal) {
		employeeSal = sal;
	}
	
	public void setEmployeeId(long id) {
		employeeId = id;
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmployeeName("Prasad");
		emp1.setEmployeeId(101);
		emp1.setEmployeeSal(30000);
		emp1.setEmployeeDesg("SD");
		
		System.out.println("---------------------------");
		System.out.println("Employee name : "+emp1.getEmployeeName());
		System.out.println("Employee Sal : " + emp1.getEmployeeSal());
		System.out.println("Employee Desg : " + emp1.getEmployeeDesg());
		System.out.println("Employee Id : " + emp1.getEmployeeId());
		
		Employee emp2 = new Employee();
		emp2.setEmployeeName("Ram Kumar");
		emp2.setEmployeeDesg("SD");
		emp2.setEmployeeSal(80000);
		emp2.setEmployeeId(102);
		
		System.out.println("---------------------------");
		System.out.println("Employee name : "+emp2.getEmployeeName());
		System.out.println("Employee Sal : " + emp2.getEmployeeSal());
		System.out.println("Employee Desg : " + emp2.getEmployeeDesg());
		System.out.println("Employee Id : " + emp2.getEmployeeId());
		
	}
}








