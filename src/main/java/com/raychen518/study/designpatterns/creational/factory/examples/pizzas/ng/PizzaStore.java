package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ng;

public class PizzaStore {

	public static final int PIZZA_TYPE_CHEESE = 1;
	public static final int PIZZA_TYPE_PEPPER_ONION = 2;
	public static final int PIZZA_TYPE_VEGGIE = 3;
	public static final int PIZZA_TYPE_CLAM = 4;
	public static final int PIZZA_TYPE_GREEK = 5;

	public Pizza orderPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PIZZA_TYPE_CHEESE:
			pizza = new CheesePizza();
			break;

		case PIZZA_TYPE_PEPPER_ONION:
			pizza = new PepperOnionPizza();
			break;

		case PIZZA_TYPE_VEGGIE:
			pizza = new VeggiePizza();
			break;

		case PIZZA_TYPE_CLAM:
			pizza = new ClamPizza();
			break;

		case PIZZA_TYPE_GREEK:
			pizza = new GreekPizza();
			break;

		default:
			pizza = null;
			break;
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
