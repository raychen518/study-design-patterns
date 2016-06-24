package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeaking...");
	}

}
