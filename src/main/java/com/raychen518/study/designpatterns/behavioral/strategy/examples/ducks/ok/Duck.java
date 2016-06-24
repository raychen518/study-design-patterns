package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public abstract class Duck {

	QuackBehavior quarkBehavior;
	FlyBehavior flyBehavior;

	public abstract void display();

	public void quack() {
		quarkBehavior.quack();
	}

	public void swim() {
		System.out.println("swimming...");
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void setQuarkBehavior(QuackBehavior quarkBehavior) {
		this.quarkBehavior = quarkBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
