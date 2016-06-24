package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quarkBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("displaying (as a model duck)...");
	}

}
