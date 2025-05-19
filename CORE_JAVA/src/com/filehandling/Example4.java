package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {
	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\bhema\\OneDrive\\Desktop\\abc.txt";
		File file = new File(location);
		
		FileInputStream fis = new FileInputStream(file);
		while(true) {
			int i = fis.read();
			if(i == -1)
				break;
			System.out.print((char)i);
		}
		
		fis.close();
		
	}
}
