package com.raychen518.study.designpatterns.behavioral.strategy;

public class Context {

	private Strategy strategy;

	public Context() {
	}

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doSomething() {
		// ...
		strategy.implementAlgorithm();
		// ...
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
