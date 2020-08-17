package de.gothaer.application;

import de.gothaer.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		
		Main m  = new Main();
		m.run();
	}

	private void run() {
		System.runFinalizersOnExit(true);
		
		System.out.println(Schwein.getCounter());
		
		// Deklaration
		Schwein piggy, babe;
		
		// Instanziierung
		piggy = new Schwein();
		
		
		// Intitialisierung
		piggy.setName("Miss Piggy");
		
		
		System.out.println(piggy.toString());
		babe = piggy;
		piggy.fressen();
		
		System.out.println(babe.toString());
		
	}

}
