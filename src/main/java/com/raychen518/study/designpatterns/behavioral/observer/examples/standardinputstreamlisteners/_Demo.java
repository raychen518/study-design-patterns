package com.raychen518.study.designpatterns.behavioral.observer.examples.standardinputstreamlisteners;

import java.io.IOException;
import java.util.Observable;

/**
 * <pre>
 * Subject		: The custom Standard Input Stream Event Source object (StandardInputStreamEventSource (java.util.Observable): addObserver(Observer), deleteObserver(Observer), notifyObservers()).
 * Observers	: A listener of the custom Standard Input Stream event (java.util.Observer <Anonymous Inner Type>: update(Observable, Object)).
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Something>");

		StandardInputStreamEventSource standardInputStreamEventSource = new StandardInputStreamEventSource();

		// A Lambda expression is used here to replace an anonymous
		// java.util.Observer class.
		standardInputStreamEventSource.addObserver((Observable observable, Object data) -> {
			System.out.println("\nReceived Response: " + data);
		});

		new Thread(standardInputStreamEventSource).start();
	}

}
