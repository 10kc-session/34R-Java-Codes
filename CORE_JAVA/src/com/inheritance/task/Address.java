package com.inheritance.task;

public class Address {
	private String city;
	private long pincode;
	private String street;
	private String state;
	public Address(String city, long pincode, String street, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.street = street;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
