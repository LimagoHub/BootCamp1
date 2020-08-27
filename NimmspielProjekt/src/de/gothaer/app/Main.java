package de.gothaer.app;

import de.gothar.client.Consumer;
import de.gothar.games.Game;
import de.gothar.games.takegame.TakeGameImpl;
import de.gothar.games.takegame.player.ComputerPlayer;
import de.gothar.games.takegame.player.HumanPlayer;

public class Main {

	public static void main(String[] args) {
		Game<Integer, Integer> game = new TakeGameImpl();
		game.addPlayer(new HumanPlayer());
		game.addPlayer(new ComputerPlayer());
		Consumer consumer = new Consumer(game);
		consumer.go();

	}

}
