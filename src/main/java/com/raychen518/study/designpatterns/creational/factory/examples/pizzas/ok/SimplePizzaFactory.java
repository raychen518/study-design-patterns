package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok;

public class SimplePizzaFactory {

	public Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new CheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new PepperOnionPizza();
			break;

		case PizzaStore.PIZZA_TYPE_VEGGIE:
			pizza = new VeggiePizza();
			break;

		case PizzaStore.PIZZA_TYPE_CLAM:
			pizza = new ClamPizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
