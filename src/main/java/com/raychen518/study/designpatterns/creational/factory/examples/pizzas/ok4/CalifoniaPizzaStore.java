package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok4;

public class CalifoniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new CalifoniaCheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new CalifoniaPepperoniPizza();
			break;

		case PizzaStore.PIZZA_TYPE_VEGGIE:
			pizza = new CalifoniaVeggiePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
