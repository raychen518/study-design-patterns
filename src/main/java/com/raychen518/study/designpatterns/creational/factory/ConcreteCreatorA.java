package com.raychen518.study.designpatterns.creational.factory;

public class ConcreteCreatorA extends Creator {

	@Override
	protected SomeObject createSomeObject() {
		return new ConcreteSomeObjectA();
	}

}
