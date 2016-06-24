package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ng;

public abstract class Duck {

	// The display() method should be abstract
	// because every kind of ducks has its display
	// thus the display process should be done by every kind of ducks.
	public abstract void display();

	public void quack() {
		System.out.println("quacking...");
	}

	public void swim() {
		System.out.println("swimming...");
	}

	public void fly() {
		System.out.println("flying...");
	}

}
