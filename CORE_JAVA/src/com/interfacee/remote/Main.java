package com.interfacee.remote;

public class Main {
	public static void main(String[] args) {
		Remote remote;
		remote = new TvRemote();
		remote.powerOn();
		remote.changeChannel(123);
		remote.volumeIncrease(100);
		remote.volumeDecrease(50);
		remote.powerOff();
		
		System.out.println("----------------------------------");
		
		remote = new DishTv();
		remote.powerOn();
		remote.changeChannel(156);
		remote.volumeIncrease(40);
		remote.volumeDecrease(60);
		remote.powerOff();
	}
}
