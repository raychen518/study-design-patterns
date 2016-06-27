package com.raychen518.study.designpatterns.creational.abstractfactory.examples.widgetfactory;

public interface WidgetFactory {

	Window createWindow();

	Button createButton();

	ScrollBar createScrollBar();

}
