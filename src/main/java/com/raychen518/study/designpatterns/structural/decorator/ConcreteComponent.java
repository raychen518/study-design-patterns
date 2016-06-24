package com.raychen518.study.designpatterns.structural.decorator;

public class ConcreteComponent extends Component {

	@Override
	public void doSomething2() {
		System.out.println(getClass().getSimpleName() + ": Doing Something (2)...");
	}

}
