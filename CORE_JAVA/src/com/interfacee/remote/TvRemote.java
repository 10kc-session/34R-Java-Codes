package com.interfacee.remote;

public class TvRemote implements Remote {
	public void powerOn() {
		System.out.println("Tv is powered on..");
	}
	public void powerOff() {
		System.out.println("Tv is powered off...");
	}
	public void changeChannel(int channelNumber) {
		System.out.println("Channel changed to " + channelNumber);
	}
	public void volumeIncrease(int volume) {
		System.out.println("The volume is increased to " + (Remote.volume + volume));
	}
	public void volumeDecrease(int volume) {
		System.out.println("The volume is decreased to " + (Remote.volume - volume));
	}
}
