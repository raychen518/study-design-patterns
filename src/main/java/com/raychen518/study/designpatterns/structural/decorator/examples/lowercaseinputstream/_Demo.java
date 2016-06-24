package com.raychen518.study.designpatterns.structural.decorator.examples.lowercaseinputstream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * Component			: java.io.InputStream
 * ConcreteComponent	: java.io.ByteArrayInputStream
 * Decorator			: java.io.FilterInputStream
 * ConcretDecorator		: java.io.BufferedInputStream, LowerCaseInputStream
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) throws IOException {
		int byteValue;
		InputStream inputStream = new LowerCaseInputStream(
				new BufferedInputStream(new ByteArrayInputStream("Say Hello to the World!".getBytes())));

		while ((byteValue = inputStream.read()) >= 0) {
			System.out.print((char) byteValue);
		}

		inputStream.close();
	}

}
