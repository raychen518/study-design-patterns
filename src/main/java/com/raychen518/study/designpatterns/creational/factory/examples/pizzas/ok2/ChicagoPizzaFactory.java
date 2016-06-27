package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok2;

public class ChicagoPizzaFactory extends PizzaFactory {

	@Override
	public Pizza createPizza(int pizzaType) {
		Pizza pizza;

		switch (pizzaType) {
		case PizzaStore.PIZZA_TYPE_CHEESE:
			pizza = new ChicagoCheesePizza();
			break;

		case PizzaStore.PIZZA_TYPE_PEPPER_ONION:
			pizza = new ChicagoPepperoniPizza();
			break;

		case PizzaStore.PIZZA_TYPE_VEGGIE:
			pizza = new ChicagoVeggiePizza();
			break;

		default:
			pizza = null;
			break;
		}

		return pizza;
	}

}
