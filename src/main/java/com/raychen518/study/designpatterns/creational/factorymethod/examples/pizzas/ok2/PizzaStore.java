package com.raychen518.study.designpatterns.creational.factorymethod.examples.pizzas.ok2;

public class PizzaStore {

	public static final int PIZZA_TYPE_CHEESE = 1;
	public static final int PIZZA_TYPE_PEPPER_ONION = 2;
	public static final int PIZZA_TYPE_VEGGIE = 3;

	PizzaFactory pizzaFactory;

	public PizzaStore(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(int pizzaType) {
		Pizza pizza = pizzaFactory.createPizza(pizzaType);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
