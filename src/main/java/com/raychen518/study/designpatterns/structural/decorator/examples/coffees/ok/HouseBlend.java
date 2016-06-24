package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class HouseBlend extends Beverage {

	private static final double COST = 0.89;

	public HouseBlend() {
		description = "House Blend";
	}

	@Override
	public double cost() {
		return COST;
	}

}
