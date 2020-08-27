package de.gothar.games;

import de.gothar.games.players.Player;

public interface Game<Z, B> {
	
	public void play();
	public void addPlayer(Player<Z,B> player);
	public void removePlayer(Player<Z,B> player);
}
