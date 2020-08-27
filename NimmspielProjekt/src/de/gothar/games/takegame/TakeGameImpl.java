package de.gothar.games.takegame;

import de.gothar.games.AbstractGame;

public class TakeGameImpl extends AbstractGame<Integer, Integer>{
	
	
	
	protected boolean isGameover() {
		return getBoard() < 1 || getPlayers().isEmpty();
	}
	
	
	
	public TakeGameImpl() {
		setBoard(23);
		
	}

	
	
	
	protected void calculateBoard() {
		setBoard(getBoard() - getTurn());
	}
	
	protected boolean validateTurn() {
		return getTurn() >= 1 && getTurn() <= 3;
	}


}
