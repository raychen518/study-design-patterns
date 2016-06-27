package com.raychen518.study.designpatterns.creational.factorymethod.examples.mazegame;

public class MagicMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		return new MagicRoom();
	}

}
