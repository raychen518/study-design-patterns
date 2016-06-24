package com.raychen518.study.designpatterns.behavioral.observer.examples.weatherbulletinboards.usingnormalobserverpattern;

public interface WeatherBulletinBoardManager {

	void registerWeatherBulletinBoard(WeatherBulletinBoard weatherBulletinBoard);

	void removeWeatherBulletinBoard(WeatherBulletinBoard weatherBulletinBoard);

	void notifyWeatherBulletinBoards();

}
