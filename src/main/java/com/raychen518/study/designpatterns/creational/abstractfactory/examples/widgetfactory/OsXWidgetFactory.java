package com.raychen518.study.designpatterns.creational.abstractfactory.examples.widgetfactory;

public class OsXWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new OsXWindow();
	}

	@Override
	public Button createButton() {
		return new OsXButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new OsXScrollBar();
	}

}
