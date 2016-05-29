package com.ublwarriors.observerpattern.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.ublwarriors.observerpattern.Subject;
import com.ublwarriors.observerpattern.WeatherData;
import com.ublwarriors.observerpattern.observer.DisplayElement;

public class ForecastDisplay implements DisplayElement, Observer {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Observable weatherData;
	
	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}

	}



	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData)
		{
			WeatherData wd = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
			display();
		}
	}

}
