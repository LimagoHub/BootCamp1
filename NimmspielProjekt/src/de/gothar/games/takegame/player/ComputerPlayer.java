package de.gothar.games.takegame.player;

public class ComputerPlayer extends AbstractTakeGamePlayer {

	public ComputerPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComputerPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer doTurn(Integer stones) {
		final int [] zuege = {3,1,1,2};
		int turn = zuege[stones % 4];
		System.out.println(String.format("Computer nimmt %s Steine.", turn));
		return turn;
	}

}
