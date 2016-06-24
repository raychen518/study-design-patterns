package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class Archer extends Character {

	public Archer() {
		weaponBehavior = new BowAndArrowsBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Fighting as an archer and ");
		useWeapon();
	}

}
