package de.gothar.client;

import de.gothar.games.Game;

public class Consumer {
	
	private final Game<?,?> game;

	public Consumer(Game<?,?> game) {
		
		this.game = game;
	}
	
	public void go() {
		game.play();
	}

}
