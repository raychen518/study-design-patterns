package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok4;

public abstract class PizzaStore {

	public static final int PIZZA_TYPE_CHEESE = 1;
	public static final int PIZZA_TYPE_PEPPER_ONION = 2;
	public static final int PIZZA_TYPE_VEGGIE = 3;

	public Pizza orderPizza(int pizzaType) {
		Pizza pizza = createPizza(pizzaType);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	// This method is a factory method.
	abstract Pizza createPizza(int pizzaType);

}
