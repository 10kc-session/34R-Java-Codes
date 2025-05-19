package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {

	public static void addDataIntoTxtFile(String location, String data) throws IOException {
		FileOutputStream fos = new FileOutputStream(location,true);

		fos.write(data.getBytes());

		fos.close();
		System.out.println("Data has been inserted...");
	}

	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\bhema\\OneDrive\\Desktop\\abc.txt";
		File file = new File(location);
		String data = "database stores data in structure format";

		if (file.exists()) {
			addDataIntoTxtFile(location, data);
		} else {
			if (file.createNewFile()) {
				System.out.println("new file created\n");
				addDataIntoTxtFile(location, data);
			}
		}

	}
}
