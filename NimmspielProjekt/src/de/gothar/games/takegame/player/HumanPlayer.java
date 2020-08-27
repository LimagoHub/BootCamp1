package de.gothar.games.takegame.player;

import java.util.Scanner;

public class HumanPlayer extends AbstractTakeGamePlayer {

	private Scanner scanner = new Scanner(System.in);
	
	public HumanPlayer() {
		super();
		
	}

	public HumanPlayer(String name) {
		super(name);
		
	}

	@Override
	public Integer doTurn(Integer stones) {
		System.out.println(String.format("Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.", stones));
		return scanner.nextInt();
	}

}
