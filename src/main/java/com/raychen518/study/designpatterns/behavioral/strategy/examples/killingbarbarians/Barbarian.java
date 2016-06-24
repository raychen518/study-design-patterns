package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class Barbarian extends Character {

	public Barbarian() {
		weaponBehavior = new AxeBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Fighting as a barbarian and ");
		useWeapon();
	}

}
