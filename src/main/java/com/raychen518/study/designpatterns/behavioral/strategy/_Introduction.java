package com.raychen518.study.designpatterns.behavioral.strategy;

/**
 * <pre>
 * =================
 * Brief
 * =================
 * The Strategy pattern defines a family of algorithms, encapsulates each algorithm, and makes the algorithms interchangeable within the family.
 * The Strategy pattern enables the algorithm to be selected at runtime.
 * 
 * The Strategy pattern is also known as the Policy pattern.
 * 
 * =================
 * Structure
 * =================
 * 		| Context				| [strategy]				| Strategy						|
 * 		|-----------------------|----->---------------------|-------------------------------|
 * 		| strategy				|							| implementAlgorithm(...)		|
 * 		| Context(Strategy)		|											|
 * 		| setStrategy(Strategy)	|											|
 * 																			|
 * 									|---------------------------------------|---------------------------------------|
 * 									|										|										|
 * 					| ConcreteStrategyA				|		| ConcreteStrategyB				|		| ConcreteStrategyC				|
 * 					|-------------------------------|		|-------------------------------|		|-------------------------------|
 * 					| implementAlgorithm(...)		|		| implementAlgorithm(...)		|		| implementAlgorithm(...)		|
 * 
 * Strategy (Interface or Abstract Class)
 * - Provide an interface to implement a changeful algorithm.
 * 
 * ConcreteStrategy (Concrete Class)
 * - Implement the Strategy interface.
 * 
 * Context (Concrete Class)
 * - Be to perform a changeful algorithm implemented by a Strategy object.
 * - Maintain a reference to a Strategy object.
 * - The Strategy object can be specified/changed at its instantiation/in its runtime.
 * 
 * =================
 * Application
 * =================
 * ---------------------------------------------------------
 * Application in Java: the Sort Method of the Collections Class
 * ---------------------------------------------------------
 * Context	: The Collections class (java.util.Collections: sort(List<T>, Comparator<? super T>)).
 * Strategy	: The Comparator objects (java.util.Comparator: compare(T, T)).
 * 
 * ---------------------------------------------------------
 * Application in Java: the Service and Request Handling Methods of the HttpServlet Class
 * ---------------------------------------------------------
 * Context	: The HttpServlet object (javax.servlet.http.HttpServlet: service(ServletRequest, ServletResponse), doXxx(HttpServletRequest, HttpServletResponse)).
 * Strategy	: The ServletRequest and ServletResponse objects (javax.servlet.ServletRequest: ...,
 *                                                            javax.servlet.ServletResponse: ...,
 *                                                            javax.servlet.http.HttpServletRequest: ...,
 *                                                            javax.servlet.http.HttpServletResponse: ...).
 * 
 * ---------------------------------------------------------
 * Application in Java: the Filter Method of the Filter Interface
 * ---------------------------------------------------------
 * Context	: The Filter object (javax.servlet.Filter: doFilter(ServletRequest, ServletResponse, FilterChain)).
 * Strategy	: The ServletRequest, ServletResponse and FilterChain objects (javax.servlet.ServletRequest: ...,
 *                                                                         javax.servlet.ServletResponse: ...,
 *                                                                         javax.servlet.FilterChain: ...).
 * 
 * =================
 * References
 * =================
 * Wikipedia - Software Design Patterns - Strategy Pattern
 * https://en.wikipedia.org/wiki/Strategy_pattern
 * 
 * Wikibooks - Computer Science Design Patterns - Strategy Pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Strategy
 * </pre>
 */
public class _Introduction {

	public static void main(String[] args) {
		// Specify the strategy at the context's instantiation.
		{
			// Specify the strategy A.
			{
				Context context = new Context(new ConcreteStrategyA());
				context.doSomething();
			}

			// Specify the strategy B.
			{
				Context context = new Context(new ConcreteStrategyB());
				context.doSomething();
			}

			// Specify the strategy C.
			{
				Context context = new Context(new ConcreteStrategyC());
				context.doSomething();
			}
		}

		System.out.println();

		// Change the strategy in the context's runtime.
		{
			// Specify the strategy A.
			Context context = new Context(new ConcreteStrategyA());
			context.doSomething();

			// Change the strategy from the strategy A to the strategy B.
			context.setStrategy(new ConcreteStrategyB());
			context.doSomething();

			// Change the strategy from the strategy B to the strategy C.
			context.setStrategy(new ConcreteStrategyC());
			context.doSomething();
		}
	}

}
