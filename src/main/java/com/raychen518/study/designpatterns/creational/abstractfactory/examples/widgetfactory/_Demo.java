package com.raychen518.study.designpatterns.creational.abstractfactory.examples.widgetfactory;

public class _Demo {

	public static void main(String[] args) {
		{
			WidgetFactory widgetFactory = new WindowsWidgetFactory();
			System.out.println("widgetFactory.createWindow()\t: " + widgetFactory.createWindow());
			System.out.println("widgetFactory.createButton()\t: " + widgetFactory.createButton());
			System.out.println("widgetFactory.createScrollBar()\t: " + widgetFactory.createScrollBar());
		}

		System.out.println();

		{
			WidgetFactory widgetFactory = new OsXWidgetFactory();
			System.out.println("widgetFactory.createWindow()\t: " + widgetFactory.createWindow());
			System.out.println("widgetFactory.createButton()\t: " + widgetFactory.createButton());
			System.out.println("widgetFactory.createScrollBar()\t: " + widgetFactory.createScrollBar());
		}

		System.out.println();

		{
			WidgetFactory widgetFactory = new LinuxWidgetFactory();
			System.out.println("widgetFactory.createWindow()\t: " + widgetFactory.createWindow());
			System.out.println("widgetFactory.createButton()\t: " + widgetFactory.createButton());
			System.out.println("widgetFactory.createScrollBar()\t: " + widgetFactory.createScrollBar());
		}
	}

}
