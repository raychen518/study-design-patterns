package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ng;

public class _Demo {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CHEESE);
		System.out.println();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_PEPPER_ONION);
		System.out.println();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_VEGGIE);
		System.out.println();

		pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CLAM);
	}

}
