package com.raychen518.study.designpatterns.creational.factorymethod.examples.pizzas.ok3;

/**
 * <pre>
 * Used multiple pizza stores to create pizzas in different areas.
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) {
		{
			PizzaStore pizzaStore = new NewYorkPizzaStore();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CHEESE);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_PEPPER_ONION);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_VEGGIE);
			System.out.println();
		}

		{
			PizzaStore pizzaStore = new ChicagoPizzaStore();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CHEESE);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_PEPPER_ONION);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_VEGGIE);
			System.out.println();
		}

		{
			PizzaStore pizzaStore = new CalifoniaPizzaStore();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_CHEESE);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_PEPPER_ONION);
			System.out.println();

			pizzaStore.orderPizza(PizzaStore.PIZZA_TYPE_VEGGIE);
			System.out.println();
		}
	}

}
