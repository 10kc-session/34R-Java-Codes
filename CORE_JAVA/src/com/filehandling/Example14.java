package com.filehandling;

import java.io.*;

class Car implements Serializable{
	private static final long serialVersionUID = 1L;
	String carName;
	String model;
	boolean flag;
	public Car(String carName, String model) {
		super();
		this.carName = carName;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", model=" + model + "]";
	}
}

public class Example14 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("car.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Car car = (Car)ois.readObject();
			System.out.println(car);
			System.out.println(car.flag);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		try(FileOutputStream fos = new FileOutputStream("car.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos)){
//			Car car = new Car("Volvo" , "XC90");
//			oos.writeObject(car);
//			System.out.println("Car Object inserted into txt file");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
