package com.raychen518.study.designpatterns.creational.abstractfactory;

/**
 * <pre>
 * =================
 * Brief
 * =================
 * The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 * 
 * The Abstract Factory pattern is also known as the Kit pattern.
 * 
 * =================
 * Structure
 * =================
 * 		| Factory						|			|------->-------| Product1		|
 * 		|-------------------------------|			|------->-------| Product2		|
 * 		| createProduct1()				|----->-----|------->-------| Product3		|
 * 		| createProduct2()				|----->-----|------->-------| ...			|
 * 		| createProduct3()				|----->-----|				|---------------|
 * 		| ...							|----->-----|				| ...			|
 * 						+													+
 * 						| Subclassing										| Subclassing
 * 						|													|
 * 						|									|-------------------------------|-------------------------------|
 * 		| ConcreteFactoryA				|		| ConcreteProductA1		|		| ConcreteProductA2		|		| ConcreteProductA3		|
 * 		| ConcreteFactoryB				|		| ConcreteProductB1		|		| ConcreteProductB2		|		| ConcreteProductB3		|
 * 		| ConcreteFactoryC				|		| ConcreteProductC1		|		| ConcreteProductC2		|		| ConcreteProductC3		|
 * 		| ...							|		| ...					|		| ...					|		| ...					|
 * 		|-------------------------------|		|-----------------------|		|-----------------------|		|-----------------------|
 * 		| createProduct1()				|--->---| ...					|		| ...					|		| ...					|
 * 		| createProduct2()				|--->-----------------------------------|								|
 * 		| createProduct3()				|--->-------------------------------------------------------------------|
 * 		| ...							|
 * 
 * Factory (Abstract Class or Interface)
 * - Declare an interface that creates some types of product objects.
 * 
 * Product (Abstract Class or Interface)
 * - Declare an interface for one type of product objects.
 * 
 * ConcreteFactory (Concrete Class)
 * - Subclass the Factory.
 * 
 * ConcreteProduct (Concrete Class)
 * - Subclass the Product.
 * 
 * =================
 * Application
 * =================
 * ---------------------------------------------------------
 * Application in Java - Xxx Xxx Xxx
 * ---------------------------------------------------------
 * Xxxxx	: Xxx xxx xxx (xxx.xxx.Xxx: xxxXxx(...)).
 * Xxxxx	: Xxx xxx xxx (xxx.xxx.Xxx: xxxXxx(...)). 
 * 
 * =================
 * References
 * =================
 * Wikipedia - Software Design Patterns - Abstract Factory Pattern
 * https://en.wikipedia.org/wiki/Abstract_factory_pattern
 * 
 * Wikibooks - Computer Science Design Patterns - Abstract Factory Pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Abstract_Factory
 * </pre>
 */
public class _Introduction {

	public static void main(String[] args) {
		{
			Factory factory = new ConcreteFactoryA();
			System.out.println("factory.createProduct1(): " + factory.createProduct1());
			System.out.println("factory.createProduct2(): " + factory.createProduct2());
			System.out.println("factory.createProduct3(): " + factory.createProduct3());
		}

		System.out.println();

		{
			Factory factory = new ConcreteFactoryB();
			System.out.println("factory.createProduct1(): " + factory.createProduct1());
			System.out.println("factory.createProduct2(): " + factory.createProduct2());
			System.out.println("factory.createProduct3(): " + factory.createProduct3());
		}

		System.out.println();

		{
			Factory factory = new ConcreteFactoryC();
			System.out.println("factory.createProduct1(): " + factory.createProduct1());
			System.out.println("factory.createProduct2(): " + factory.createProduct2());
			System.out.println("factory.createProduct3(): " + factory.createProduct3());
		}
	}

}
