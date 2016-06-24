package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingnormalobserverpattern;

/**
 * <pre>
 * Subject		: The Weather Data object (WeatherData).
 * Observers	: The Weather Bulletin Board objects (XxxWeatherBulletinBoard).
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		// =================================================
		// Subject.registerObserver(Observer)
		// in the Observers' Instantiation
		// =================================================
		new CurrentConditionsWeatherBulletinBoard(weatherData);
		weatherData.setMeasurements(1.2F, 2.3F, 3.4F);

		System.out.println("------------------------------------------------------------------------");

		new StatisticsWeatherBulletinBoard(weatherData);
		weatherData.setMeasurements(2.3F, 3.4F, 4.5F);

		System.out.println("------------------------------------------------------------------------");

		new ForecastWeatherBulletinBoard(weatherData);
		weatherData.setMeasurements(3.4F, 4.5F, 5.6F);

		System.out.println("------------------------------------------------------------------------");

		// =================================================
		// Subject.registerObserver(Observer)
		// =================================================
		CurrentConditionsWeatherBulletinBoard currentConditionsWeatherBulletinBoard = new CurrentConditionsWeatherBulletinBoard();
		weatherData.registerWeatherBulletinBoard(currentConditionsWeatherBulletinBoard);
		weatherData.setMeasurements(4.5F, 5.6F, 6.7F);

		System.out.println("------------------------------------------------------------------------");

		// =================================================
		// Subject.unregisterObserver(Observer)
		// =================================================
		weatherData.removeWeatherBulletinBoard(currentConditionsWeatherBulletinBoard);
		weatherData.setMeasurements(5.6F, 6.7F, 7.8F);

		System.out.println("------------------------------------------------------------------------");

		// =================================================
		// Subject.notifyObservers()
		// =================================================
		weatherData.notifyWeatherBulletinBoards();
	}

}
