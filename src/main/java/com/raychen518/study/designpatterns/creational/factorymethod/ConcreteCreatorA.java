package com.raychen518.study.designpatterns.creational.factorymethod;

public class ConcreteCreatorA extends Creator {

	@Override
	protected SomeObject createSomeObject() {
		return new ConcreteSomeObjectA();
	}

}
