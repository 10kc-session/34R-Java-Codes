package com.object;

class Address1 implements Cloneable{
	String street;

	public Address1(String street) {
		this.street = street;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address1 [street=" + street + "]";
	}
}

class Employee1 implements Cloneable {
	String name;
	Address1 address;

	public Employee1(String name, Address1 address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Employee1 clone = (Employee1)super.clone(); 
		
		clone.address = (Address1)this.address.clone();
	
		return clone;		
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", address=" + address + "]";
	}
}

public class Example3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 address = new Address1("JNTUH");

		Employee1 employee1 = new Employee1("john", address);
		Employee1 employee2 = (Employee1) employee1.clone();

		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);

		employee1.name = "John abraham";
		
		System.out.println();
		System.out.println("-----After Modification----");

		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);

		employee1.address.street = "Kukatpally";
		
		System.out.println();
		System.out.println("-----After Modification----");

		System.out.println("employee1 : " + employee1);
		System.out.println("employee2 : " + employee2);
		
		System.out.println("---------Hashcode of Address1 Object after clone----------");
		System.out.println(employee1.address.hashCode());
		System.out.println(employee2.address.hashCode());

	}
}
