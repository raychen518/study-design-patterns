package com.raychen518.study.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	private Object state;

	private List<Observer> observers = new ArrayList<>();

	public void setState(Object state) {
		this.state = state;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(state);
		}
	}

}
