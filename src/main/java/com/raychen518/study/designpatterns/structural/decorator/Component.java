package com.raychen518.study.designpatterns.structural.decorator;

public abstract class Component {

	public void doSomething1() {
		System.out.println(getClass().getSimpleName() + ": Doing Something (1)...");
	}

	public abstract void doSomething2();

	public void doSomething3() {
		System.out.println(getClass().getSimpleName() + ": Doing Something (3)...");
	}

}
