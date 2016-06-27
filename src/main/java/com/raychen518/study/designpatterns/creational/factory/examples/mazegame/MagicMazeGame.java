package com.raychen518.study.designpatterns.creational.factory.examples.mazegame;

public class MagicMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		return new MagicRoom();
	}

}
