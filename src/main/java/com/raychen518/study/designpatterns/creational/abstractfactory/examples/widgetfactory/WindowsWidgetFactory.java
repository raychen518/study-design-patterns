package com.raychen518.study.designpatterns.creational.abstractfactory.examples.widgetfactory;

public class WindowsWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new WindowsWindow();
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollBar();
	}

}
