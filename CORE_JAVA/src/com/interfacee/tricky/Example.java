package com.interfacee.tricky;

interface Vehicle{
	void start();
	void stop();
	default void digitalMeter() {
		System.out.println("Digital meter");
	}
}
class Car implements Vehicle{

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}
	
	@Override
	public void digitalMeter() {
		System.out.println("Touch digital meter");
	}
	
}
class Bike implements Vehicle{

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}
	
}

public class Example {

}
