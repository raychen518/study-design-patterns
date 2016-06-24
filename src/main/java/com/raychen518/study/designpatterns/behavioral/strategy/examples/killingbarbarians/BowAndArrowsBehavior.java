package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

public class BowAndArrowsBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("using the bow and arrows...");
	}

}
