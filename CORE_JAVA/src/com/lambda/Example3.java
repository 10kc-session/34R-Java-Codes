package com.lambda;

import java.util.function.Function;

class SensorData{
	private double temparature , humidity;

	public SensorData(double temparature, double humidity) {
		super();
		this.temparature = temparature;
		this.humidity = humidity;
	}

	public double getTemparature() {
		return temparature;
	}

	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
}
public class Example3 {
	public static void main(String[] args) {
		double threshold = 25.0;
		
		SensorData sensorData = new SensorData(15, 45);
		Function<SensorData , Double> extractTemp = sensor -> sensor.getTemparature();
		double extractedTemparature = extractTemp.apply(sensorData);
		System.out.println("Extracted Temparature : " + extractedTemparature);

		Function<Double , Boolean> thresholdTemp = temparature -> temparature > threshold;
		boolean apply = thresholdTemp.apply(extractedTemparature);
		System.out.println("Is Threshold Temparature Exceeded ? " + apply);
	}
}











