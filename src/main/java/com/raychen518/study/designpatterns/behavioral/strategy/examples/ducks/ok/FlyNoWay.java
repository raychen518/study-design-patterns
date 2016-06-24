package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("<Unable to Fly>");
	}

}
