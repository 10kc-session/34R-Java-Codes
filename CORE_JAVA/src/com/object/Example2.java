package com.object;

class Address {
	String street;

	public Address(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}
}

class Employee implements Cloneable {
	String name;
	Address address;

	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // copies one object data into another object.
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
}

public class Example2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("JNTUH");

		Employee employee1 = new Employee("john", address);
		Employee employee2 = (Employee) employee1.clone();

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
		
		System.out.println("---------Hashcode of Address Object after clone----------");
		System.out.println(employee1.address.hashCode());
		System.out.println(employee2.address.hashCode());

	}
}
