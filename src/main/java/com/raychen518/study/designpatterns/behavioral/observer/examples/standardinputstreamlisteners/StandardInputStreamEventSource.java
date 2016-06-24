package com.raychen518.study.designpatterns.behavioral.observer.examples.standardinputstreamlisteners;

import java.util.Observable;
import java.util.Scanner;

public class StandardInputStreamEventSource extends Observable implements Runnable {

	@Override
	public void run() {
		while (true) {
			// Don't close this scanner to remove the Resource Leak warning (the
			// warning is actually a false positive), otherwise the demo
			// application using this class will fail.
			@SuppressWarnings("resource")
			String response = new Scanner(System.in).next();

			setChanged();
			notifyObservers(response);
		}
	}

}
