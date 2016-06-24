package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingjavabuiltinobserverpattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsWeatherBulletinBoard implements Observer, DisplayController {

	private Observable observable;

	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsWeatherBulletinBoard() {
	}

	public CurrentConditionsWeatherBulletinBoard(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object data) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();

			display();
		}
	}

	@Override
	public void display() {
		StringBuilder prompt = new StringBuilder();
		prompt.append("Displaying the Current Conditions weather bulletin board (" + Integer.toHexString(hashCode())
				+ ")...\n");
		prompt.append("temperature\t: " + temperature + "\n");
		prompt.append("humidity\t: " + humidity + "\n");
		prompt.append("pressure\t: " + pressure);

		System.out.println(prompt);
	}

}
