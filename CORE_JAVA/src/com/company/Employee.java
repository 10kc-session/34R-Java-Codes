package com.company;

public class Employee {
	private String employeeName;
	private int employeeId;
	private double employeeSalary;
	private String employeeDesg;
	/**
	 * @param employeeName
	 * @param employeeId
	 * @param employeeSalary
	 * @param employeeDesg
	 */
	public Employee(String employeeName, int employeeId, double employeeSalary, String employeeDesg) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeDesg = employeeDesg;
		System.out.println("Employee object is created..");
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeSalary
	 */
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	/**
	 * @param employeeSalary the employeeSalary to set
	 */
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	/**
	 * @return the employeeDesg
	 */
	public String getEmployeeDesg() {
		return employeeDesg;
	}
	/**
	 * @param employeeDesg the employeeDesg to set
	 */
	public void setEmployeeDesg(String employeeDesg) {
		this.employeeDesg = employeeDesg;
	}
	
}
