package de.composite.visitors;

import de.composite.Konto;
import de.composite.KontoGruppe;

public class AbstractKontenVisitor implements KontenVisitor {

	@Override
	public void visit(Konto konto) {
		// ok

	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		// ok

	}

}
