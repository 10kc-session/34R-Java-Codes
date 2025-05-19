package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\bhema\\OneDrive\\Desktop\\abc.txt";
		
		FileOutputStream fos = new FileOutputStream(location , true);
		
		String str = "\nSpring boot is extension for spring framework.";
		
		byte[] bytes = str.getBytes();
		
		fos.write(bytes);
		
		fos.close();
		
		System.out.println("Data Inserted..");
		
		
	}
}
