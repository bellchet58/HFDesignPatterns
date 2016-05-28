package com.ublwarriors.observerpattern.observer.impl;

import com.ublwarriors.observerpattern.Subject;
import com.ublwarriors.observerpattern.WeatherData;
import com.ublwarriors.observerpattern.observer.DisplayElement;
import com.ublwarriors.observerpattern.observer.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
	private float tempSum = 0.0f;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private int numReading;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		tempSum+=temp;
		numReading++;
		if(temp>maxTemp)
			maxTemp = temp;
		else if(temp<minTemp)
			minTemp = temp;
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReading)
				+ "/" + maxTemp + "/" + minTemp);
	}

}
