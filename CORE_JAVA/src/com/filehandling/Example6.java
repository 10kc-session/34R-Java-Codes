package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {
	public static void main(String[] args) throws IOException{
		var fis = new FileInputStream("C:\\Users\\bhema\\OneDrive\\Desktop\\Extras\\images\\logo.png");
		var fos = new FileOutputStream("logo.png");
		int i;
		while((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
		System.out.println("Data Copied");
	}
}
