package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok2;

public class NewYorkPizzaFactory extends PizzaFactory {

	@Override
	public Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new NewYorkCheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new NewYorkPepperOnionPizza();
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
