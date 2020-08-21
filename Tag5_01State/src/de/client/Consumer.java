package de.client;

import de.state.Front;

public class Consumer {

	public static void main(String[] args) {
		Front front = new Front();
		
		front.print();
		front.changeToB();
		front.print();
		front.changeToB();
	}

}
