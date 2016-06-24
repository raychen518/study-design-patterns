package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingjavabuiltinobserverpattern;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		// By invoking the setChanged() method, the Observable object is marked
		// as having been changed.
		// The hasChanged method now returns true.
		setChanged();

		// Another variant of this method is notifyObservers(Object),
		// which parameter is an object passed to the Observer objects.
		// In both methods, a reference to the Observable object is passed to
		// the Observer objects.
		notifyObservers();
	}

}
