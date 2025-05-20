package com.filehandling;

class Demo implements AutoCloseable{
	public void run() {
		System.out.println("Hello World");
	}
	public void close() {
		System.out.println("Resource Closed..");
	}
}

class Alpha implements AutoCloseable{
	
	public void run() {
		System.out.println("Hello Alpha");
	}
	
	@Override
	public void close(){
		System.out.println("Alpha Resource Closed");
	}
}


public class Example10 {
	public static void main(String[] args) {
//		Demo demo = null;
//		try {
//			demo = new Demo();
//			demo.run();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(demo != null)
//				demo.close();
//		}
		Demo demo = new Demo();
		Alpha alpha = new Alpha();
		try(demo;alpha;){
			demo.run();
			alpha.run();
		}
		
	}
}
