package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public abstract class AbstractMitarbeiterVisistor implements MitarbeiterVisitor{

	@Override
	public void visit(GehaltsEmpfänger gehaltsEmpfänger) {
		// Ok
		
	}

	@Override
	public void visit(LohnEmpfänger lohnEmpfänger) {
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
