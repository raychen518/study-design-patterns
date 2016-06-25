package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok2;

/**
 * <pre>
 * Used multiple pizza factories to create pizzas in different areas.
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
