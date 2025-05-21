package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	String street;
	String city;
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}

class Employee implements Serializable {
	Address address;
	String name;
	public Employee(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + "]";
	}
}

public class Example13 {
	public static void main(String[] args) {
//		try(
//				FileOutputStream fos = new FileOutputStream("employee_data.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos)
//			){
//			Address address = new Address("jntuh" , "hyd");
//			Employee employee = new Employee(address, "John");
//			
//			oos.writeObject(employee);
//			
//			System.out.println("Employee data inserted.");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try(FileInputStream fis = new FileInputStream("employee_data.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				
				Employee emp = (Employee)ois.readObject();
				System.out.println(emp);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
