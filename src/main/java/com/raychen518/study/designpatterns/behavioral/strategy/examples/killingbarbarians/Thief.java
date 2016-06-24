package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class Thief extends Character {

	public Thief() {
		weaponBehavior = new KnifeBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Fighting as a thief and ");
		useWeapon();
	}

}
