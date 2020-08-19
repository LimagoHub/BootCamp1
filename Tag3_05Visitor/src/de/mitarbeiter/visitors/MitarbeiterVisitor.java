package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public interface MitarbeiterVisitor {
	
	void visit(GehaltsEmpfänger gehaltsEmpfänger);
	void visit(LohnEmpfänger lohnEmpfänger);

}
