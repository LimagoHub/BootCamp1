package de.composite.visitors;

import de.composite.AbstractKontoNode;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class PrintVisitor implements KontenVisitor {

	@Override
	public void visit(Konto konto) {
		print(konto);

	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		print(kontoGruppe);

	}
	
	private void print(AbstractKontoNode node) {
		System.out.println(node);
	}

}
