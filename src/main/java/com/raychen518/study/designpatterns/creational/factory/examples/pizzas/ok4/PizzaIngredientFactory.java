package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok4;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggie[] createVeggies();

	Pepperoni createPepperoni();

}
