package de.composite;

import de.composite.visitors.KontenVisitor;

public class Konto extends AbstractKontoNode {

	private double saldo = 0;
	
	public Konto(String label) {
		super(label);
		
	}

	public Konto(String label, double saldo) {
		super(label);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Konto [saldo=");
		builder.append(saldo);
		builder.append(", getParent()=");
		builder.append(getParent().getLabel());
		builder.append(", getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void accept(KontenVisitor visitor) {
		visitor.visit(this);
		
	}

	
	
	
	

}
