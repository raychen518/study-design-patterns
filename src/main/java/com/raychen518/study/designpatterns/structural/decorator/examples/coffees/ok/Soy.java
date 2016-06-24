package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class Soy extends Condiment {

	private static final String DESCRIPTION = "Soy";

	private static final double COST = 0.15;

	private Beverage beverage;

	public Soy(Beverage beverage) {
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
