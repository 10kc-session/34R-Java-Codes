package com.interfacee.remote;

public interface Remote {
	
	int volume = 100; // public static final
	
	void powerOn();
	void powerOff();
	void changeChannel(int channelNumber);
	void volumeIncrease(int volume);
	void volumeDecrease(int volume);
}

