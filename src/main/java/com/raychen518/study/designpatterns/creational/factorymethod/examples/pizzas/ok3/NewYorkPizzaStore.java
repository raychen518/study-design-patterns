package com.raychen518.study.designpatterns.creational.factorymethod.examples.pizzas.ok3;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new NewYorkCheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new NewYorkPepperoniPizza();
			break;

		case PizzaStore.PIZZA_TYPE_VEGGIE:
			pizza = new NewYorkVeggiePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
