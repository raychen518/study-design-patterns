package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quarkBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("displaying (as a red-head duck)...");
	}

}
