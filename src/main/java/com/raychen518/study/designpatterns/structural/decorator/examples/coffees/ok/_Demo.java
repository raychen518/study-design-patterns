package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ok;

/**
 * <pre>
 * Component			: Beverage
 * ConcreteComponent	: HouseBlend, DarkRoast, Decaf, Espresso
 * Decorator			: Condiment
 * ConcretDecorator		: Milk, Mocha, Soy, Whip
 * </pre>
 */
public class _Demo {

	/**
	 * <pre>
	 * Cost (Coffee)
	 * ---------------------------------
	 * House Blend	: 0.89
	 * Dark Roast	: 0.99
	 * Decaf		: 1.05
	 * Espresso		: 1.99
	 * 
	 * Cost (Condiment)
	 * ---------------------------------
	 * Milk			: 0.10
	 * Mocha		: 0.20
	 * Soy			: 0.15
	 * Whip			: 0.10
	 * </pre>
	 */

	public static void main(String[] args) {
		{
			Beverage houseBlend = new HouseBlend();
			System.out.println("houseBlend.getDescription()\t: " + houseBlend.getDescription());
			System.out.println("houseBlend.cost()\t\t: " + houseBlend.cost());

			Beverage darkRoast = new DarkRoast();
			System.out.println("darkRoast.getDescription()\t: " + darkRoast.getDescription());
			System.out.println("darkRoast.cost()\t\t: " + darkRoast.cost());

			Beverage decaf = new Decaf();
			System.out.println("decaf.getDescription()\t\t: " + decaf.getDescription());
			System.out.println("decaf.cost()\t\t\t: " + decaf.cost());

			Beverage dspresso = new Espresso();
			System.out.println("dspresso.getDescription()\t: " + dspresso.getDescription());
			System.out.println("dspresso.cost()\t\t\t: " + dspresso.cost());
		}

		System.out.println();

		{
			Beverage mixedBeverage = new Milk(new HouseBlend());
			System.out.println("mixedBeverage.getDescription()\t: " + mixedBeverage.getDescription());
			System.out.println("mixedBeverage.cost()\t\t: " + mixedBeverage.cost());
		}

		System.out.println();

		{
			Beverage mixedBeverage = new Whip(new Mocha(new DarkRoast()));
			System.out.println("mixedBeverage.getDescription()\t: " + mixedBeverage.getDescription());
			System.out.println("mixedBeverage.cost()\t\t: " + mixedBeverage.cost());
		}

		System.out.println();

		{
			Beverage mixedBeverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
			System.out.println("mixedBeverage.getDescription()\t: " + mixedBeverage.getDescription());
			System.out.println("mixedBeverage.cost()\t\t: " + mixedBeverage.cost());
		}
	}

}
