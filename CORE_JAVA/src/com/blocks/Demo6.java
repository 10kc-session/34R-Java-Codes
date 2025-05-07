package com.blocks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Y{
	private String str;
	private boolean status;
	
	static {
		System.out.println("Y class Loaded...");
	}
	
	public Y() {
	
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
}

public class Demo6 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.blocks.Y"); 
			// external jars -> packages -> classes -> dynamic load -> jdbc and servlets
			System.out.println();
			Method[] declaredMethods = clazz.getDeclaredMethods();
			for(Method method : declaredMethods) {
				System.out.println(method);
			}
			
			System.out.println();
			
			Field[] declaredFields = clazz.getDeclaredFields();
			for(Field field : declaredFields) {
				System.out.println(field);
			}
			
			System.out.println();
			
			System.out.println(clazz.getDeclaredConstructors().length);
			
			System.out.println();
			
			System.out.println(clazz.getClassLoader());
			
			System.out.println();
			
			System.out.println(clazz.getClassLoader().getParent());
			
			System.out.println();
			
			System.out.println(clazz.getClassLoader().getParent().getParent());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}








