package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class GehaltsEmpf�nger extends AbstractMitarbeiter {
	
	private double gehalt=1000;
	
	

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public GehaltsEmpf�nger() {
		// TODO Auto-generated constructor stub
	}
	public GehaltsEmpf�nger(String name) {
		super(name);
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GehaltsEmpf�nger [gehalt=");
		builder.append(gehalt);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
	


}
