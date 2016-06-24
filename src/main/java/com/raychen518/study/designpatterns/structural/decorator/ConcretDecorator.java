package com.raychen518.study.designpatterns.structural.decorator;

public class ConcretDecorator extends Decorator {

	private Component component;

	public ConcretDecorator(Component component) {
		this.component = component;
	}

	@Override
	public void doSomething2() {
		System.out.println(getClass().getSimpleName() + ": Decorating (before)...");
		component.doSomething2();
		System.out.println(getClass().getSimpleName() + ": Decorating (after)...");
	}

}
