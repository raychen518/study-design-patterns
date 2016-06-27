package com.raychen518.study.designpatterns.creational.factorymethod;

public class ConcreteCreatorC extends Creator {

	@Override
	protected SomeObject createSomeObject() {
		return new ConcreteSomeObjectC();
	}

}
