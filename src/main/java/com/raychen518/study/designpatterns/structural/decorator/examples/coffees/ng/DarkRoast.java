package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ng;

public class DarkRoast extends Beverage {

	private static final double COST = 0.99;

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return COST + super.cost();
	}

}
