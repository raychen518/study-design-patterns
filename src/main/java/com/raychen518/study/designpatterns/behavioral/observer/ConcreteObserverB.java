package com.raychen518.study.designpatterns.behavioral.observer;

public class ConcreteObserverB implements Observer {

	private Object state;

	private Subject subject;

	public ConcreteObserverB() {
	}

	public ConcreteObserverB(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(Object state) {
		System.out.println("Updating the Observer B Using the State (" + state + ") from the Subject...");
		this.state = state;
	}

	public void unregisterFromSubject() {
		subject.unregisterObserver(this);
	}

	public Object getState() {
		return state;
	}

}
