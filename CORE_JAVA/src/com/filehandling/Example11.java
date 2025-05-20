package com.filehandling;

import java.io.FileInputStream;

public class Example11 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("sample.txt");){
			while(true) {
				int i = fis.read();
				if(i == -1) break;
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
