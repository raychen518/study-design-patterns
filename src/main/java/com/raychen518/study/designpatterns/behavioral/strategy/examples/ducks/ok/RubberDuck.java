package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quarkBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("displaying (as a rubber duck)...");
	}

}
