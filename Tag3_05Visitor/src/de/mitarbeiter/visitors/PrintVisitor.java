package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public class PrintVisitor extends AbstractMitarbeiterVisistor {

	@Override
	public void visit(GehaltsEmpf�nger gehaltsEmpf�nger) {
		System.out.println(gehaltsEmpf�nger);

	}

	@Override
	public void visit(LohnEmpf�nger lohnEmpf�nger) {
		System.out.println(lohnEmpf�nger);

	}

}
