package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quarkBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("displaying (as a decoy duck)...");
	}

}
