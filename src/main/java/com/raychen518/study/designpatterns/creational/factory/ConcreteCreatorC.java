package com.raychen518.study.designpatterns.creational.factory;

public class ConcreteCreatorC extends Creator {

	@Override
	protected SomeObject createSomeObject() {
		return new ConcreteSomeObjectC();
	}

}
