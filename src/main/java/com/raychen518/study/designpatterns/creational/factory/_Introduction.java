package com.raychen518.study.designpatterns.creational.factory;

/**
 * <pre>
 * =================
 * Brief
 * =================
 * The Factory Method pattern defines an interface for creating an object,
 * but lets the subclasses decide which class to instantiate.
 * That is to say, the Factory Method pattern lets a class defer instantiation to its subclasses.
 * 
 * The Factory Method pattern is also known as the Virtual Constructor pattern.
 * 
 * =================
 * Structure
 * =================
 * 		| Creator						|			|--------->---------| SomeObject					|
 * 		|-------------------------------|			|					|-------------------------------|
 * 		| createSomeObject(...)			|----->-----|					| ...							|
 * 						+																+
 * 						| Subclassing													| Subclassing
 * 						|																|
 * 		| ConcreteCreatorA				|			|--------->---------| ConcreteSomeObjectA			|
 * 		| ConcreteCreatorB				|			|--------->---------| ConcreteSomeObjectB			|
 * 		| ConcreteCreatorC				|			|--------->---------| ConcreteSomeObjectC			|
 * 		| ...							|			|--------->---------| ...							|
 * 		|-------------------------------|			|					|-------------------------------|
 * 		| createSomeObject(...)			|----->-----|					| ...							|
 * 
 * Creator (Abstract Class or Interface)
 * - Declare a factory method (createSomeObject(...)) to create an object (the method return type is SomeObject).
 * - May define a default implementation of the factory method to create a default object (some ConcreteSomeObject object).
 * - May call the factory method.
 * 
 * SomeObject (Abstract Class or Interface)
 * - Define an interface of objects that the factory method in the Creator creates.
 * 
 * ConcreteCreator (Concrete Class)
 * - Subclass the Creator.
 * - Override the factory method to create an object (some ConcreteSomeObject object).
 * 
 * ConcreteSomeObject (Concrete Class)
 * - Subclass the SomeObject.
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
 * Wikipedia - Software Design Patterns - Factory Method Pattern
 * https://en.wikipedia.org/wiki/Factory_method_pattern
 * 
 * Wikibooks - Computer Science Design Patterns - Factory Method Pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Factory_method
 * </pre>
 */
public class _Introduction {

	public static void main(String[] args) {
		{
			Creator creator = new ConcreteCreatorA();
			System.out.println("creator.createSomeObject() instanceof ConcreteSomeObjectA: "
					+ (creator.createSomeObject() instanceof ConcreteSomeObjectA));
		}

		{
			Creator creator = new ConcreteCreatorB();
			System.out.println("creator.createSomeObject() instanceof ConcreteSomeObjectB: "
					+ (creator.createSomeObject() instanceof ConcreteSomeObjectB));
		}

		{
			Creator creator = new ConcreteCreatorC();
			System.out.println("creator.createSomeObject() instanceof ConcreteSomeObjectC: "
					+ (creator.createSomeObject() instanceof ConcreteSomeObjectC));
		}
	}

}
