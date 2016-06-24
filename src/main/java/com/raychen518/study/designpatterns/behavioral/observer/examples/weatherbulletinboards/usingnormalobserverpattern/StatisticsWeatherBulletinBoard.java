package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingnormalobserverpattern;

public class StatisticsWeatherBulletinBoard implements WeatherBulletinBoard, DisplayController {

	private WeatherBulletinBoardManager weatherBulletinBoardManager;

	private float temperature;
	private float humidity;
	private float pressure;

	public StatisticsWeatherBulletinBoard() {
	}

	public StatisticsWeatherBulletinBoard(WeatherBulletinBoardManager weatherBulletinBoardManager) {
		this.weatherBulletinBoardManager = weatherBulletinBoardManager;
		this.weatherBulletinBoardManager.registerWeatherBulletinBoard(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		display();
	}

	@Override
	public void display() {
		StringBuilder prompt = new StringBuilder();
		prompt.append(
				"Displaying the Statistics weather bulletin board (" + Integer.toHexString(hashCode()) + ")...\n");
		prompt.append("temperature\t: " + temperature + "\n");
		prompt.append("humidity\t: " + humidity + "\n");
		prompt.append("pressure\t: " + pressure);

		System.out.println(prompt);
	}

}
