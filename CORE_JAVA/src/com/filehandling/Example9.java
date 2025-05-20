package com.filehandling;

import java.io.*;

public class Example9 {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("logo.png");
		FileWriter writer = new FileWriter("logo2.png");
		
		int i;
		
		while((i = reader.read()) != -1) {
			writer.write(i);
		}
		
		reader.close();
		writer.close();
		
		System.out.println("Image created");
	}
}
