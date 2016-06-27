package com.raychen518.study.designpatterns.creational.abstractfactory;

public class ConcreteFactoryA extends Factory {

	@Override
	Product1 createProduct1() {
		return new ConcreteProductA1();
	}

	@Override
	Product2 createProduct2() {
		return new ConcreteProductA2();
	}

	@Override
	Product3 createProduct3() {
		return new ConcreteProductA3();
	}

}
