package com.raychen518.study.designpatterns.creational.factorymethod.examples.mazegame;

public class OrdinaryMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		return new OrdinaryRoom();
	}

}
