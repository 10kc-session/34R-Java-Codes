package com.exceptions;

class Demo {
	public void method1(int num) throws Exception {
		if(num == 0) {
			throw new Exception("Zero Not Allowed");
		}else if(num < 0) {
			throw new RuntimeException("Negative Not Allowed");
		}else {
			System.out.println(num);
		}
	}
	public void method2(String a) throws NullPointerException , RuntimeException {
		if(a == null) {
			throw new NullPointerException("null not allowed");
		}
		else if(a.isEmpty()) {
			throw new RuntimeException("Empty string not allowed");
		}
		
	}
}

public class Example8 {
	public static void main(String[] args) {
		try {
			new Demo().method2("");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
}
