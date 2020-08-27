package de.gothar.games;

import java.util.ArrayList;
import java.util.List;

import de.gothar.games.players.Player;

public abstract class AbstractGame<Z,B> implements Game<Z,B> {
	
	
	private List<Player<Z, B>> players = new ArrayList<>();
	private B board;
	private Z turn;
	
	
	protected abstract boolean isGameover();

	protected List<Player<Z, B>> getPlayers() {
		return players;
	}

	@Override
	public void play() {
		while( ! isGameover()) 	executeTurns();
	}
	
	private void executeTurns() {
		for (Player<Z,B> player : players)
			executeTurn(player);
	}
	
	private void executeTurn(Player<Z,B> player) {
		
		if(isGameover()) return;
		while(turnIsNotValid(player)) System.out.println("Ungültiger Zug");
		terminateTurn(player.getName());
	}	
	
	

	private boolean turnIsNotValid(Player<Z,B> player) {
		
		setTurn(player.doTurn(getBoard()));
		return ! validateTurn() ;
	}


	private void terminateTurn(String player) {
		calculateBoard();
		checkLosing(player);
	}
	private void checkLosing(String player) {
		if( isGameover()) System.out.println(player + " hat verloren");
	}
	protected abstract void calculateBoard();
	
	protected abstract boolean validateTurn() ;


	@Override
	public void addPlayer(Player<Z, B> player) {
		players.add(player);
		
	}

	@Override
	public void removePlayer(Player<Z, B> player) {
		players.remove(player);
		
	}

	protected B getBoard() {
		return board;
	}

	protected void setBoard(B board) {
		this.board = board;
	}

	protected Z getTurn() {
		return turn;
	}

	protected void setTurn(Z turn) {
		this.turn = turn;
	}

	
	
	
	
	

}
