package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ng;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("displaying (as a decoy duck)...");
	}

	// The decoy duck cannot quack,
	// so the quack() method should be overridden here.
	@Override
	public void quack() {
		System.out.println("<Unable to Quack>");
	}

	// The decoy duck cannot fly,
	// so the fly() method should be overridden here.
	@Override
	public void fly() {
		System.out.println("<Unable to Fly>");
	}

}
