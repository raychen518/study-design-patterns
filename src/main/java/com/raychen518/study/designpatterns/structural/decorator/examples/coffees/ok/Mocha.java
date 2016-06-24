package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class Mocha extends Condiment {

	private static final String DESCRIPTION = "Mocha";

	private static final double COST = 0.20;

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + DESCRIPTION;
	}

	@Override
	public double cost() {
		return COST + beverage.cost();
	}

}
