package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\bhema\\OneDrive\\Desktop\\abc.txt";
		
		File file = new File(location);
		
		System.out.println(file.delete() ? "Deleted" : "Not Found");
		
//		if(file.exists()) {
//			System.out.println("File Exists");
//		}else {
//			System.out.println("No file located.");
//			
//			boolean newFile = file.createNewFile();
//			if(newFile)
//				System.out.println("New File is Created.");
//		}
	}
}
