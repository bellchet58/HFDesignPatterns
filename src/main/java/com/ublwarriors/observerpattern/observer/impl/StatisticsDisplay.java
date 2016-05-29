package com.ublwarriors.observerpattern.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.ublwarriors.observerpattern.Subject;
import com.ublwarriors.observerpattern.WeatherData;
import com.ublwarriors.observerpattern.observer.DisplayElement;

public class StatisticsDisplay implements DisplayElement, Observer {
	private float tempSum = 0.0f;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private int numReading;
	private Observable weatherData;
	
	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReading)
				+ "/" + maxTemp + "/" + minTemp);
	}


	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) o;
			tempSum += weatherData.getTemperature();
			numReading++;
			if(weatherData.getTemperature()>maxTemp)
				maxTemp = weatherData.getTemperature();
			if (weatherData.getTemperature()<minTemp)
				minTemp = weatherData.getTemperature();
			display();
		}
	}

}
