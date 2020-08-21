package de.state;

public class StateB extends AbstractState {

	public StateB(Front front) {
		super(front);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("Hier druckt B!");
	}

	@Override
	public void changeToA() {
		getFront().current = getFront().stateA;
	}
	
	

}
