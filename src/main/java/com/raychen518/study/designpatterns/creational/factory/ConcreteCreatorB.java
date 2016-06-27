package com.raychen518.study.designpatterns.creational.factory;

public class ConcreteCreatorB extends Creator {

	@Override
	protected SomeObject createSomeObject() {
		return new ConcreteSomeObjectB();
	}

}
