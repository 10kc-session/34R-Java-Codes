package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class Example12 {
	public static void main(String[] args)  {
		
		try(FileInputStream fis = new FileInputStream("student_data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Student student = (Student)ois.readObject();
			System.out.println(student);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		try(
//				FileOutputStream fos = new FileOutputStream("student_data.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos)
//			){
//			Student student = new Student(101 , "John");
//			oos.writeObject(student);
//			System.out.println("Object Stored in student file");		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
	}
}	
