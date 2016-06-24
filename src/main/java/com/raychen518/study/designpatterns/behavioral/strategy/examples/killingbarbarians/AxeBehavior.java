package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("using the axe...");
	}

}
