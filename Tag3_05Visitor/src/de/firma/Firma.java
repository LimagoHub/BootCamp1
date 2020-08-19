package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Firma {
	
	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	public boolean addMitarbeiter(AbstractMitarbeiter mitarbeiter) {
		return mitarbeiters.add(mitarbeiter);
	}

	public boolean removeMitarbeiter(AbstractMitarbeiter mitarbeiter) {
		return mitarbeiters.remove(mitarbeiter);
	}
	
	
	public void print() {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			System.out.println(mitarbeiter);
		}
	}
	public void iterate(MitarbeiterVisitor visitor) {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			//visitor.visit(mitarbeiter);
			mitarbeiter.accept(visitor);
		}
	}
	
}
