package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public abstract class AbstractMitarbeiterVisistor implements MitarbeiterVisitor{

	@Override
	public void visit(GehaltsEmpf�nger gehaltsEmpf�nger) {
		// Ok
		
	}

	@Override
	public void visit(LohnEmpf�nger lohnEmpf�nger) {
		// Ok
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	
}
