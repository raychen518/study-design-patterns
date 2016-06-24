package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class Espresso extends Beverage {

	private static final double COST = 1.99;

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return COST;
	}

}
