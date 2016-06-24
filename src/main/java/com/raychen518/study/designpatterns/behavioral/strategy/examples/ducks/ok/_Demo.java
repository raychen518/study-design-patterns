package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ok;

/**
 * <pre>
 * Context	: The Duck objects (Duck: <Constructor>, setQuarkBehavior(QuackBehavior), setFlyBehavior(FlyBehavior)).
 * Strategy	: The behavior objects (QuackBehavior: quack(), FlyBehavior: fly()).
 * </pre>
 */
public class _Demo {

	private static final Class<?>[] DUCK_CLASSES = new Class<?>[] { MallardDuck.class, RedheadDuck.class,
			RubberDuck.class, DecoyDuck.class };

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for (Class<?> duckClass : DUCK_CLASSES) {
			Duck duck = (Duck) duckClass.newInstance();
			duck.display();
			duck.quack();
			duck.swim();
			duck.fly();
			System.out.println();
		}

		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.quack();
		modelDuck.swim();
		modelDuck.fly();
		System.out.println();

		modelDuck.setQuarkBehavior(new Quack());
		modelDuck.setFlyBehavior(new FlyWithWings());

		modelDuck.quack();
		modelDuck.fly();
	}

}
