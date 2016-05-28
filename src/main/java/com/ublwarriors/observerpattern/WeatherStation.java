package com.ublwarriors.observerpattern;

import com.ublwarriors.observerpattern.observer.impl.CurrentConditionsDisplay;
import com.ublwarriors.observerpattern.observer.impl.ForecastDisplay;
import com.ublwarriors.observerpattern.observer.impl.HeatIndexDisplay;
import com.ublwarriors.observerpattern.observer.impl.StatisticsDisplay;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
