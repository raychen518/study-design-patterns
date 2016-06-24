package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ng;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("displaying (as a rubber duck)...");
	}

	// The rubber duck cannot quack, instead, it squeaks,
	// so the quack() method should be overridden here.
	@Override
	public void quack() {
		System.out.println("squeaking...");
	}

	// The rubber duck cannot fly,
	// so the fly() method should be overridden here.
	@Override
	public void fly() {
		System.out.println("<Unable to Fly>");
	}

}
