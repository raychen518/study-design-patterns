package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class Milk extends Condiment {

	private static final String DESCRIPTION = "Milk";

	private static final double COST = 0.10;

	private Beverage beverage;

	public Milk(Beverage beverage) {
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
