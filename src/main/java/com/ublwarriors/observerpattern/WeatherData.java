package com.ublwarriors.observerpattern;

import java.util.ArrayList;
import java.util.Observable;

import com.ublwarriors.observerpattern.observer.Observer;

public class WeatherData extends Observable{

	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData()
	{
	}
	
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature()
	{
		return temperature;
	}
	public float getHumidity()
	{
		return humidity;
	}
	public float getPressure()
	{
		return pressure;
	}
}
