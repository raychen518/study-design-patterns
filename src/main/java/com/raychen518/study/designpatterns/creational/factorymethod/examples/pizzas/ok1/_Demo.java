package com.raychen518.study.designpatterns.creational.factorymethod.examples.pizzas.ok1;

/**
 * <pre>
 * Moved the pizza creation to a pizza factory.
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CHEESE);
		System.out.println();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_PEPPER_ONION);
		System.out.println();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_VEGGIE);
	}

}
