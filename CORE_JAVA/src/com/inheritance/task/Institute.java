package com.inheritance.task;

public class Institute {
	private String course;
	private double fees;
	public Institute(String course, double fees) {
		super();
		this.course = course;
		this.fees = fees;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
