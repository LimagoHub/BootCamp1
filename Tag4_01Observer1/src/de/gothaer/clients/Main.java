package de.gothaer.clients;

import de.gothaer.tiere.PigTooFatListener;
import de.gothaer.tiere.Schwein;

public class Main {
	
	private Metzger metzger = new Metzger();
	private Spediteur spediteur = new Spediteur();

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
		piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
//		piggy.addPigTooFatListener(new PigTooFatListener() {
//
//			@Override
//			public void pigTooFat(Schwein sender) {
//				spediteur.fahren(sender);
//				
//			}});
		
		piggy.addPigTooFatListener(spediteur::fahren);
		
		for (int i = 0; i <11 ; i++) {
			piggy.fressen();
		}
		
	}
	
	class SchweineMetzgerAdapter implements PigTooFatListener {

		@Override
		public void pigTooFat(Schwein sender) {
			metzger.schlachten(sender);
			
		}
		
	}

}

class Metzger {
	// ....

	public void schlachten(Object tier) {
		System.out.println("Messer wetz!");
		
	}
	
}

class Spediteur {
	public void fahren(Object ware) {
		System.out.println("Wir fahren auf der Autobahn");
	}
}
