package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public abstract class Character {

	WeaponBehavior weaponBehavior;

	public abstract void fight();

	public void useWeapon() {
		weaponBehavior.useWeapon();
	}

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

}
