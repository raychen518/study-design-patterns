package com.raychen518.study.designpatterns.behavioral.observer.examples.angelanddevillisteners;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * <pre>
 * Subject		: The button (javax.swing.JButton: addActionListener(ActionListener), removeActionListener(ActionListener), fireActionPerformed(ActionEvent)).
 * Observers	: The button's action listeners (java.awt.event.ActionListener <Anonymous Inner Type>: actionPerformed(ActionEvent)).
 * </pre>
 */
public class _Demo {

	JFrame frame;

	public void start() {
		frame = new JFrame();
		frame.setSize(200, 150);
		frame.setLocation(400, 240);

		JButton button = new JButton("Should I do it?");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Devil: Come on, do it!");
			}

		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Angel: Don't do it, you might regret it!");
			}

		});

		frame.getContentPane().add(BorderLayout.CENTER, button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		_Demo demo = new _Demo();
		demo.start();
	}

}
