package com.raychen518.study.designpatterns.creational.abstractfactory;

public class ConcreteFactoryB extends Factory {

	@Override
	Product1 createProduct1() {
		return new ConcreteProductB1();
	}

	@Override
	Product2 createProduct2() {
		return new ConcreteProductB2();
	}

	@Override
	Product3 createProduct3() {
		return new ConcreteProductB3();
	}

}
