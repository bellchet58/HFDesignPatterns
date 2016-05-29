package com.ublwarriors.observerpattern.observer.impl;

import java.util.Observable;
import java.util.Observer;

import com.ublwarriors.observerpattern.Subject;
import com.ublwarriors.observerpattern.WeatherData;
import com.ublwarriors.observerpattern.observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	
	private float temperature;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable)
	{
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable o, Object arg){
		if(o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
	}

}
