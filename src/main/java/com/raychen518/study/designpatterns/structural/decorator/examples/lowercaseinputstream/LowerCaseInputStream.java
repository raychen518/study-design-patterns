package com.raychen518.study.designpatterns.structural.decorator.examples.lowercaseinputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream inputStream) {
		super(inputStream);
	}

	@Override
	public int read() throws IOException {
		int result = super.read();

		if (result != -1) {
			result = Character.toLowerCase(result);
		}

		return result;
	}

}
