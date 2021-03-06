package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public class Decaf extends Beverage {

	private static final double COST = 1.05;

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return COST;
	}

}
