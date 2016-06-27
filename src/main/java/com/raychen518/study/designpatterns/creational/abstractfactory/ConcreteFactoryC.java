package com.raychen518.study.designpatterns.creational.abstractfactory;

public class ConcreteFactoryC extends Factory {

	@Override
	Product1 createProduct1() {
		return new ConcreteProductC1();
	}

	@Override
	Product2 createProduct2() {
		return new ConcreteProductC2();
	}

	@Override
	Product3 createProduct3() {
		return new ConcreteProductC3();
	}

}
