package com.raychen518.study.designpatterns.behavioral.observer;

/**
 * <pre>
 * =================
 * Brief
 * =================
 * The Observer pattern defines a one-to-many dependency between objects
 * where a state change in one object results in all its dependents being notified and updated automatically.
 * 
 * The Observer pattern is often used to implement distributed event handling systems,
 * and it is also a key part in the MVC (Model–View–Controller) pattern.
 * The Observer pattern is implemented in numerous programming libraries and systems, including almost all GUI toolkits.
 * 
 * The Observer pattern is also known as the Publish-Subscribe pattern or the Dependents pattern.
 * 
 * =================
 * Structure
 * =================
 * 		| Subject						|											| Observer				|
 * 		|-------------------------------|											|-----------------------|
 * 		| registerObserver(Observer)	|											| update(...)			|
 * 		| unregisterObserver(Observer)	|														|
 * 		| notifyObservers()				|														|
 * 						|																		|
 * 						|									|-----------------------------------|-----------------------------------|
 * 						|									|									|									|
 * 		| ConcreteSubject				|		| ConcreteObserverA		|			| ConcreteObserverB		|			| ConcreteObserverC		|
 * 		|-------------------------------|		|-----------------------|			|-----------------------|			|-----------------------|
 * 		| state							|		| state					|			| state					|			| state					|
 * 		| observers						|		| subject				|			| subject				|			| subject				|
 * 		|								|		| update(...)			|			| update(...)			|			| update(...)			|
 * 						|									|									|									|
 * 						|									|-----------------------------------|-----------------------------------|
 * 						|																		|
 * 						| [observers]												  [subject] |
 * 						|------>----------------------------------------------------------<-----|
 * 
 * Subject (Interface)
 * - Provide an interface to register/unregister/notify Observer objects.
 *   Note: Other action phrases are also used here, like attach/detach/notify, subscribe/unsubscribe/notify, add/delete/notify, etc.
 * 
 * Observer (Interface)
 * - Provide an interface to update an Observer object.
 * 
 * ConcreteSubject (Concrete Class)
 * - Implement the Subject interface.
 * - Maintain some state. 
 * - Maintain references to its Observer objects.
 * - Trigger the notification of its Observer objects when its state changes.
 * 
 * ConcreteObserver (Concrete Class)
 * - Implement the Observer interface.
 * - Maintain some state corresponding to the state of its Subject object. 
 * - Maintain a reference to its Subject object.
 * 
 * =================
 * Application
 * =================
 * ---------------------------------------------------------
 * Application in Java - the Built-in Observer Pattern
 * ---------------------------------------------------------
 * Note: This built-in pattern seems seldom used, maybe because the java.util.Observable is a class instead of an interface
 * (thus violating the rule - programming to interfaces instead of classes).
 * 
 * 		| Subject						|											| Observer						|
 * 		| java.util.Observable			|											| java.util.Observer			|
 * 		|-------------------------------|											|-------------------------------|
 * 		| changed						|											| update(Observable, Object)	|
 * 		| observers						|															|
 * 		| addObserver(Observer)			|															|
 * 		| deleteObserver(Observer)		|															|
 * 		| deleteObservers()				|															|
 * 		| notifyObservers()				|															|
 * 		| notifyObservers(Object)		|															|
 * 		| setChanged()					|															|
 * 		| clearChanged()				|															|
 * 		| hasChanged()					|															|
 * 						|																			|
 * 						|										|-----------------------------------|-----------------------------------|
 * 						|										|									|									|
 * 		| ExtendedObservable (optional)	|		| ConcreteObserverA				|	| ConcreteObserverB				|	| ConcreteObserverC				|
 * 		|-------------------------------|		|-------------------------------|	|-------------------------------|	|-------------------------------|
 * 		| ...							|		| state							|	| state							|	| state							|
 * 						|						| observable					|	| observable					|	| observable					|
 * 						|						| update(Observable, Object)	|	| update(Observable, Object)	|	| update(Observable, Object)	|
 * 						|										|									|									|
 * 						|										|-----------------------------------|-----------------------------------|
 * 						|																			|
 * 						| [observers]												   [observable] |
 * 						|------>-------------------------------------------------------------<------|
 * 
 * Observable (Concrete Class)
 * - Provide an implementation to add/delete/notify Observer objects.
 * - Maintain some flag indicating whether it is changed. 
 * - Maintain references to its Observer objects.
 * - Trigger the notification of its Observer objects when it is changed.
 * 
 * Observer (Interface)
 * - Provide an interface to update an Observer object.
 * 
 * ExtendedObservable (Concrete Class)
 * - Be optional.
 * - Extend the Observable class.
 * 
 * ConcreteObserverX (Concrete Class)
 * - Implement the Observer interface.
 * - Maintain some state corresponding to the state change of its Observable object. 
 * - Maintain a reference to its Observable object.
 * 
 * ---------------------------------------------------------
 * Application in Java - Swing Action Listeners
 * ---------------------------------------------------------
 * 		| Subject								|					| Observer								|
 * 		| java.awt.ItemSelectable				|					| java.awt.event.ActionListener			|
 * 		|---------------------------------------|					|---------------------------------------|
 * 		| addItemListener(ItemListener)			|					| actionPerformed(ActionEvent)			|
 * 		| removeItemListener(ItemListener)		|					|										|
 * 							|															|
 * 							|															|
 * 		| ConcreteSubject						|					| ConcreteObserver						|
 * 		| javax.swing.AbstractButton			|	----->------	| ...ButtonActionListener				|
 * 		| java.awt.Checkbox						|	------<-----	| ...ScrollListener						|
 * 		| java.awt.List							|	----->------	| ...KeyboardHomeHandler				|
 * 		| ...									|	------<-----	| ...									|
 * 		|---------------------------------------|	----->------	|---------------------------------------|
 * 		| ...									|					| actionPerformed(ActionEvent)			|
 * 
 * ---------------------------------------------------------
 * Application in Java - Other Event Listeners
 * ---------------------------------------------------------
 * Subject		: All objects to use the following event listeners (java.util.EventListener).
 * Observers	: - The HTTP session binding listeners (javax.servlet.http.HttpSessionBindingListener:
 * 															valueBound(HttpSessionBindingEvent),
 * 															valueUnbound(HttpSessionBindingEvent)). 
 * 				  - The HTTP session attribute listeners (javax.servlet.http.HttpSessionAttributeListener:
 * 															attributeAdded(HttpSessionBindingEvent),
 * 															attributeRemoved(HttpSessionBindingEvent),
 * 															attributeReplaced(HttpSessionBindingEvent)). 
 * 				  - The Phase listeners (javax.faces.event.PhaseListener:
 * 											afterPhase(PhaseEvent),
 * 											beforePhase(PhaseEvent)). 
 * 
 * =================
 * References
 * =================
 * Wikipedia - Software Design Patterns - Observer Pattern
 * https://en.wikipedia.org/wiki/Observer_pattern
 * 
 * Wikibooks - Computer Science Design Patterns - Observer Pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Observer
 * </pre>
 */
public class _Introduction {

	public static void main(String[] args) {
		{
			ConcreteSubject concreteSubject = new ConcreteSubject();
			Object concreteSubjectState = null;

			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println();

			concreteSubject.registerObserver(new ConcreteObserverA());

			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println();

			concreteSubject.registerObserver(new ConcreteObserverB());

			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println();

			Observer concreteObserverC = new ConcreteObserverC();
			concreteSubject.registerObserver(concreteObserverC);

			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println();

			concreteSubject.unregisterObserver(concreteObserverC);

			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println();

			concreteSubject.notifyObservers();
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		{
			ConcreteSubject concreteSubject = new ConcreteSubject();
			Object concreteSubjectState = null;

			// Instantiate an Observer object using the Subject object.
			ConcreteObserverA concreteObserverA = new ConcreteObserverA(concreteSubject);
			System.out.println("concreteObserverA.getState(): " + concreteObserverA.getState());
			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println("concreteObserverA.getState(): " + concreteObserverA.getState());
			System.out.println();

			// The maintained reference to the Subject object can be used by the
			// Observer object to actively unregister from the Subject object,
			// instead of passively being unregistered by the Subject object.
			concreteObserverA.unregisterFromSubject();
			System.out.println("concreteObserverA.getState(): " + concreteObserverA.getState());
			concreteSubjectState = new Object();
			System.out.println("concreteSubjectState: " + concreteSubjectState);
			concreteSubject.setState(concreteSubjectState);
			System.out.println("concreteObserverA.getState(): " + concreteObserverA.getState());
		}
	}

}
