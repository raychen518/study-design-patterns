package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class Knight extends Character {

	public Knight() {
		weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Fighting as a knight and ");
		useWeapon();
	}

}
