package com.inheritance.task;

public class Student {
	private String name;
	private String branch;
	private Institute institute; // HAS a relation
	private Address address; // Has a relation
	
	public Student(String name, String branch, Institute institute , Address address) {
		super();
		this.name = name;
		this.branch = branch;
		this.institute = institute;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Institute getInstitute() {
		return institute;
	}
	public void setInstitute(Institute institute) {
		this.institute = institute;
	}	
}
