package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ng;

public abstract class Beverage {

	private static final double COST_MILK = 0.1;
	private static final double COST_SOY = 0.15;
	private static final double COST_MOCHA = 0.2;
	private static final double COST_WHIP = 0.1;

	String description;

	private boolean addingMilk;
	private boolean addingMocha;
	private boolean addingSoy;
	private boolean addingWhip;

	public String getDescription() {
		return description;
	}

	public boolean isAddingMilk() {
		return addingMilk;
	}

	public void setAddingMilk(boolean addingMilk) {
		this.addingMilk = addingMilk;
	}

	public boolean isAddingMocha() {
		return addingMocha;
	}

	public void setAddingMocha(boolean addingMocha) {
		this.addingMocha = addingMocha;
	}

	public boolean isAddingSoy() {
		return addingSoy;
	}

	public void setAddingSoy(boolean addingSoy) {
		this.addingSoy = addingSoy;
	}

	public boolean isAddingWhip() {
		return addingWhip;
	}

	public void setAddingWhip(boolean addingWhip) {
		this.addingWhip = addingWhip;
	}

	public double cost() {
		double result = 0;

		if (addingMilk) {
			result += COST_MILK;
		}

		if (addingMocha) {
			result += COST_MOCHA;
		}

		if (addingSoy) {
			result += COST_SOY;
		}

		if (addingWhip) {
			result += COST_WHIP;
		}

		return result;
	}

}
