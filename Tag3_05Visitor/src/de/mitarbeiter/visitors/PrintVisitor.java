package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public class PrintVisitor extends AbstractMitarbeiterVisistor {

	@Override
	public void visit(GehaltsEmpfänger gehaltsEmpfänger) {
		System.out.println(gehaltsEmpfänger);

	}

	@Override
	public void visit(LohnEmpfänger lohnEmpfänger) {
		System.out.println(lohnEmpfänger);

	}

}
