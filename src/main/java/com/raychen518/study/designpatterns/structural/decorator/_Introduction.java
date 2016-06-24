package com.raychen518.study.designpatterns.structural.decorator;

/**
 * <pre>
 * =================
 * Brief
 * =================
 * The Decorator pattern attaches additional responsibilities to an object dynamically.
 * 
 * The Decorator pattern provides a flexible alternative to subclassing for extending functionality.
 * 
 * The Decorator pattern is also known as the Wrapper pattern.
 * 
 * =================
 * Structure
 * =================
 * 		| Component				|		subclassing		| Decorator								|
 * 		|-----------------------|<----------------------|---------------------------------------|
 * 		| doSomething(...)		|						| doSomething(...)						|
 * 					+														+
 * 					| subclassing											| subclassing
 * 					|														|
 * 		| ConcreteComponent1	|						| ConcretDecorator1						|
 * 		| ConcreteComponent2	|						| ConcretDecorator2						|
 * 		| ConcreteComponent3	|						| ConcretDecorator3						|
 * 		| ...					|						| ...									|
 * 		|-----------------------|						|---------------------------------------|
 * 		| doSomething(...)		|				|---<---| component								|
 * 		|						|				|		| doSomething(...) // Decorating...		|
 * 					|							|
 * 					|							|
 * 					|---------------------------|
 * 
 * Component (Interface or Abstract Class)
 * - Define the interface for objects that can have responsibilities added to them dynamically.
 * 
 * ConcreteComponent (Concrete Class)
 * - Implement the Component interface.
 * 
 * Decorator (Interface or Abstract Class)
 * - Define an interface (only the part for decoration) that comforts to the Component's interface.
 * 
 * ConcretDecorator (Concrete Class)
 * - Implement the Decorator interface (decorating by adding the responsibilities).
 * - Maintain a reference to its Component object.
 * 
 * =================
 * Application
 * =================
 * ---------------------------------------------------------
 * Application in Java - the I/O Classes
 * ---------------------------------------------------------
 * 		| Component						|						| Decorator								|
 * 		| java.io.InputStream			|		extending		| java.io.FilterInputStream				|
 * 		|-------------------------------|<----------------------|---------------------------------------|
 * 		| read()						|						| read()								|
 * 		| ...							|						| ...									|
 * 						+															+
 * 						| extending													| extending
 * 						|															|
 * 		| ConcreteComponent				|						| ConcretDecorator						|
 * 		| java.io.FileInputStream		|						| java.io.BufferedInputStream			|
 * 		| java.io.ByteArrayInputStream	|						| java.io.DataInputStream				|
 * 		| java.io.ObjectInputStream		|						| java.io.PushbackInputStream			|
 * 		| ...							|						| ...									|
 * 		|-------------------------------|						|---------------------------------------|
 * 		| read()						|				|---<---| component								|
 * 		| ...							|				|		| read() // Decorating...				|
 * 		| ...							|				|		| ...									|
 * 						|								|
 * 						|-------------------------------|
 * 
 * Besides java.io.InputStream, most subclasses of java.io.OutputStream, java.io.Reader and java.io.Writer
 * have a constructor accepting an instance of its type or its super type.
 * 
 * ---------------------------------------------------------
 * Application in Java - the Collections Class
 * ---------------------------------------------------------
 * The java.util.Collections class contains static methods that accepts a collection/map and returns a new collection/map, such as follows.
 * - checkedXxx(...)		e.g. public static <E> Collection<E> checkedCollection(Collection<E> collection, Class<E> type)
 * 								 public static <K, V> Map<K, V> checkedMap(Map<K, V> map, Class<K> keyType, Class<V> valueType)
 * - synchronizedXxx(...)	e.g. public static <T> Collection<T> synchronizedCollection(Collection<T> collection)
 * 								 public static <K,V> Map<K,V> synchronizedMap(Map<K,V> map)
 * - unmodifiableXxx(...)	e.g. public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> collection)
 * 								 public static <K,V> Map<K,V> unmodifiableMap(Map<? extends K, ? extends V> map) 
 * 
 * ---------------------------------------------------------
 * Application in Java - the Collection/Map Classes
 * ---------------------------------------------------------
 * Many collection/map classes have a constructor
 * that accepts a collection/map of other types and returns a collection/map of their types, such as follows.
 * - java.util.ArrayList<E>
 * - java.util.HashSet<E>
 * - java.util.PriorityQueue<E>
 * - java.util.HashMap<K, V>
 * 
 * ---------------------------------------------------------
 * Application in Java - the HTTP Servlet Request/Response Wrapper Class
 * ---------------------------------------------------------
 * - The javax.servlet.http.HttpServletRequestWrapper class implements the javax.servlet.http.HttpServletRequest interface,
 *   and it also has a constructor accepting an javax.servlet.http.HttpServletRequest object.
 * - The javax.servlet.http.HttpServletResponseWrapper class implements the javax.servlet.http.HttpServletResponse interface,
 *   and it also has a constructor accepting an javax.servlet.http.HttpServletResponse object.
 * 
 * =================
 * References
 * =================
 * Wikipedia - Software Design Patterns - Decorator Pattern
 * https://en.wikipedia.org/wiki/Decorator_pattern
 * 
 * Wikibooks - Computer Science Design Patterns - Decorator Pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Decorator
 * </pre>
 */
public class _Introduction {

	public static void main(String[] args) {
		Component concreteComponent = new ConcreteComponent();
		concreteComponent.doSomething2();
		System.out.println();

		Decorator concretDecorator = new ConcretDecorator(concreteComponent);
		concretDecorator.doSomething2();
		System.out.println();

		concretDecorator = new ConcretDecorator(concretDecorator);
		concretDecorator.doSomething2();
	}

}
