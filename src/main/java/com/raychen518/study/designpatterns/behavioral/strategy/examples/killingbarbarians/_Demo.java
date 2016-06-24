package com.raychen518.study.designpatterns.behavioral.strategy.examples.killingbarbarians;

/**
 * <pre>
 * Context	: The Character objects (Character: <Constructor>, setWeaponBehavior(WeaponBehavior)).
 * Strategy	: The weapon behavior objects (WeaponBehavior: useWeapon()).
 * </pre>
 */
public class _Demo {

	private static final Class<?>[] CHARACTER_CLASSES = new Class<?>[] { Knight.class, Thief.class, Archer.class,
			Barbarian.class };

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for (Class<?> characterClass : CHARACTER_CLASSES) {
			Character character = (Character) characterClass.newInstance();
			character.fight();
			System.out.println();
		}

		Character knight = new Knight();
		knight.setWeaponBehavior(new AxeBehavior());
		knight.fight();
	}

}
