package de.gothaer.bauer;

import de.gothaer.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		Schwein babe = new Schwein("Babe");
		
		System.out.println(babe);
		
		babe.fressen();
		
		System.out.println(babe);
		
		while (babe.getGewicht() < 11)
			;
		
		System.out.println(babe);

	}

}
