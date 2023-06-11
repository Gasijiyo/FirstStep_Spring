package com.pysstudy.learnspringframework;

import com.pysstudy.learnspringframework.game.GameRunner;
import com.pysstudy.learnspringframework.game.MarioGame;
import com.pysstudy.learnspringframework.game.PacmanGame;
import com.pysstudy.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
		var pacmanGame = new PacmanGame();	// 1. Object Creation
		
		var gameRunner = new GameRunner(pacmanGame);
		// 2. Object Creation + wiring of Dependencies
		// Game is a Dependency of GameRunner
		
		gameRunner.run();
	} 

}
