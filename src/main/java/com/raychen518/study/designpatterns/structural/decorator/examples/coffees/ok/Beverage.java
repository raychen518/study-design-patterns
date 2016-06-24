package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

public abstract class Beverage {

	String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
