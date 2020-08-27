package de.gothar.games.players;

public interface Player<Z, B> {
	
	String getName();
	Z doTurn(B board);

}
