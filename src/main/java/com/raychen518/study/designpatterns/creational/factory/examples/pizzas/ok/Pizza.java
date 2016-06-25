package com.raychen518.study.designpatterns.creational.factory.examples.pizzas.ok;

public abstract class Pizza {

	public void prepare() {
		System.out.println(getClass().getSimpleName() + "> Preparing...");
	}

	public void bake() {
		System.out.println(getClass().getSimpleName() + "> Baking...");
	}

	public void cut() {
		System.out.println(getClass().getSimpleName() + "> Cutting...");
	}

	public void box() {
		System.out.println(getClass().getSimpleName() + "> Boxing...");
	}

}
