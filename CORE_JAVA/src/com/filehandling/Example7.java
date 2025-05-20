package com.filehandling;

import java.io.*;

public class Example7 {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("sample.txt");
		writer.write("File Handling in java");
		writer.write("\nIO is base package for all operations");
		writer.close();
		
		System.out.println("File Created and Data is Inserted");
	}
}
