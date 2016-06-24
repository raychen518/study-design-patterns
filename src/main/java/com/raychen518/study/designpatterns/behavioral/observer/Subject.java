package com.raychen518.study.designpatterns.behavioral.observer;

public interface Subject {

	void registerObserver(Observer observer);

	void unregisterObserver(Observer observer);

	void notifyObservers();

}
