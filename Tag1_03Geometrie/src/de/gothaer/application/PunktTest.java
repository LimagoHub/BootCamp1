package de.gothaer.application;

import de.gothaer.geometrie.Punkt;

public class PunktTest {

	public static void main(String[] args) {
		Punkt p = new Punkt();
		System.out.println(p.toString());
		
		for (int i = 0; i < 11; i++) {
			p.rechts();
			System.out.println(p.toString());
		}

	}

}
