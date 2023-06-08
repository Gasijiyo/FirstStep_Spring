package com.pysstudy.learnspringframework;

import com.pysstudy.learnspringframework.game.GameRunner;
import com.pysstudy.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
