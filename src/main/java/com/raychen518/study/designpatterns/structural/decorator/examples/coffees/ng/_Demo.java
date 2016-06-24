package com.raychen518.study.designpatterns.structural.decorator.examples.coffees.ng;

/**
 * <pre>
 * =================
 * Limitations
 * =================
 * Current code is NG due to following limitations.
 * - Multiple portions of some condiment cannot be added into one coffee.
 * - A new coffee' class inherits some improper condiment' method (such as the Tea class contains the Whip condiment's methods).
 * - The base class Beverage has to been updated if some condiment has changed its cost.
 * - The base class Beverage has to been updated if there is some new condiment.
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
			System.out.println("House Blend, Milk");
			Beverage mixedBeverage = new HouseBlend();
			mixedBeverage.setAddingMilk(true);
			System.out.println("mixedBeverage.cost()\t\t: " + mixedBeverage.cost());
		}

		System.out.println();

		{
			System.out.println("Dark Roast, Mocha, Whip");
			Beverage mixedBeverage = new DarkRoast();
			mixedBeverage.setAddingMocha(true);
			mixedBeverage.setAddingWhip(true);
			System.out.println("mixedBeverage.cost()\t\t: " + mixedBeverage.cost());
		}

		System.out.println();

		{
			System.out.println("Dark Roast, Mocha, Mocha, Whip");
			System.out.println("<This set is not supported.>");
		}
	}

}
