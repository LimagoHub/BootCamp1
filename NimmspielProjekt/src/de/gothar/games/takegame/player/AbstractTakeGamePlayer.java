package de.gothar.games.takegame.player;

import de.gothar.games.players.Player;

public abstract class AbstractTakeGamePlayer implements Player<Integer, Integer> {
	
	
	private String name = this.getClass().getSimpleName();
	
	
	public AbstractTakeGamePlayer() {
		
	}
	

	public AbstractTakeGamePlayer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		
		return name;
	}

	

}
