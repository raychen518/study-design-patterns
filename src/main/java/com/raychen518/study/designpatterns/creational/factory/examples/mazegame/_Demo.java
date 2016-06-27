package com.raychen518.study.designpatterns.creational.factory.examples.mazegame;

/**
 * <pre>
 * Creator				: MazeGame (the factory method: makeRoom())
 * SomeObject			: Room
 * ConcreteCreator		: OrdinaryMazeGame, MagicMazeGame
 * ConcreteSomeObject	: OrdinaryRoom, MagicRoom
 * </pre>
 */
public class _Demo {

	public static void main(String[] args) {
		{
			MazeGame mazeGame = new OrdinaryMazeGame();

			for (Room room : mazeGame.getRooms()) {
				System.out.println("room instanceof OrdinaryRoom: " + (room instanceof OrdinaryRoom));
			}
		}

		System.out.println();

		{
			MazeGame mazeGame = new MagicMazeGame();

			for (Room room : mazeGame.getRooms()) {
				System.out.println("room instanceof MagicRoom: " + (room instanceof MagicRoom));
			}
		}
	}

}
