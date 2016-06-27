package com.raychen518.study.designpatterns.creational.factorymethod.examples.pizzas.ok1;

public class PizzaFactory {

	public Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new CheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new PepperoniPizza();
			break;

		case PizzaStore.PIZZA_TYPE_VEGGIE:
			pizza = new VeggiePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
