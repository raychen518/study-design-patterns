package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingnormalobserverpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherBulletinBoardManager {

	private float temperature;
	private float humidity;
	private float pressure;

	private List<WeatherBulletinBoard> weatherBulletinBoards = new ArrayList<>();

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

		notifyWeatherBulletinBoards();
	}

	@Override
	public void registerWeatherBulletinBoard(WeatherBulletinBoard weatherBulletinBoard) {
		weatherBulletinBoards.add(weatherBulletinBoard);
	}

	@Override
	public void removeWeatherBulletinBoard(WeatherBulletinBoard weatherBulletinBoard) {
		weatherBulletinBoards.remove(weatherBulletinBoard);
	}

	@Override
	public void notifyWeatherBulletinBoards() {
		for (WeatherBulletinBoard weatherBulletinBoard : weatherBulletinBoards) {
			weatherBulletinBoard.update(temperature, humidity, pressure);
		}
	}

}
