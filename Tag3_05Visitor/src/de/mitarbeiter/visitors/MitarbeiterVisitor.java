package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public interface MitarbeiterVisitor {
	
	void init();
	void visit(GehaltsEmpf�nger gehaltsEmpf�nger);
	void visit(LohnEmpf�nger lohnEmpf�nger);
	void dispose();

}
