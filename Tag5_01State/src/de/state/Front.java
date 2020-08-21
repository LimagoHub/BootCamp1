package de.state;

public class Front {
	
	protected final State stateA = new StateA(this);
	protected final State stateB = new StateB(this);
	protected State current = stateA;
	
	public void print() {
		current.print();
	}
	public void changeToA() {
		current.changeToA();
	}
	public void changeToB() {
		current.changeToB();
	}
	
	
	

}
