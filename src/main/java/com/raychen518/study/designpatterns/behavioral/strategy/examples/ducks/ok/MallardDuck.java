package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quarkBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("displaying (as a mallard duck)...");
	}

}
