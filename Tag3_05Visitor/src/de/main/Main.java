package de.main;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;
import de.mitarbeiter.visitors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		firma.addMitarbeiter(new GehaltsEmpf�nger("Schmidt"));
		firma.addMitarbeiter(new GehaltsEmpf�nger("Meier"));
		firma.addMitarbeiter(new LohnEmpf�nger("Hinz"));
		firma.addMitarbeiter(new LohnEmpf�nger("Kunz"));
		firma.addMitarbeiter(new GehaltsEmpf�nger("Schulz"));
		
		//firma.print();
		firma.iterate(new PrintVisitor());
	}

}
