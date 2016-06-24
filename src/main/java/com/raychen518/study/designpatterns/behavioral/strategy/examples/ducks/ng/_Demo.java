package com.raychen518.study.designpatterns.behavioral.strategy.examples.ducks.ng;

/**
 * <pre>
 * =================
 * Issue
 * =================
 * Although most kinds of ducks quack and fly, for those ducks unable to quack and fly,
 * the quack() and fly() methods inherited from the Duck class have to be overridden.
 * 
 * For example, the DecoyDuck class extending the Duck class has to override
 * its quack() and fly() methods because a decoy duck cannot quack and fly.
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
	}

}
