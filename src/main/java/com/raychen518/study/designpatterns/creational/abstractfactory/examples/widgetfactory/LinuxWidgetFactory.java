package com.raychen518.study.designpatterns.creational.abstractfactory.examples.widgetfactory;

public class LinuxWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new LinuxWindow();
	}

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new LinuxScrollBar();
	}

}
