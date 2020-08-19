package de.main;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;
import de.mitarbeiter.visitors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		firma.addMitarbeiter(new GehaltsEmpfänger("Schmidt"));
		firma.addMitarbeiter(new GehaltsEmpfänger("Meier"));
		firma.addMitarbeiter(new LohnEmpfänger("Hinz"));
		firma.addMitarbeiter(new LohnEmpfänger("Kunz"));
		firma.addMitarbeiter(new GehaltsEmpfänger("Schulz"));
		
		//firma.print();
		firma.iterate(new PrintVisitor());
	}

}
