package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("flying...");
	}

}
