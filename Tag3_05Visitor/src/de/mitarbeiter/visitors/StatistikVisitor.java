package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public class StatistikVisitor implements MitarbeiterVisitor {
	private int gehaltsempfängerZähler;
	private int lohnempfängerZähler;
	

	@Override
	public void init() {
		gehaltsempfängerZähler = 0;
		lohnempfängerZähler = 0;

	}

	@Override
	public void visit(GehaltsEmpfänger gehaltsEmpfänger) {
		gehaltsempfängerZähler ++;

	}

	@Override
	public void visit(LohnEmpfänger lohnEmpfänger) {
		lohnempfängerZähler ++;

	}

	@Override
	public void dispose() {
		System.out.println(this);

	}

	public int getGehaltsempfängerZähler() {
		return gehaltsempfängerZähler;
	}

	
	public int getLohnempfängerZähler() {
		return lohnempfängerZähler;
	}


	public int getGesamt() {
		return lohnempfängerZähler + gehaltsempfängerZähler;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [getGehaltsempfängerZähler=");
		builder.append(getGehaltsempfängerZähler());
		builder.append(", getLohnempfängerZähler=");
		builder.append(getLohnempfängerZähler());
		builder.append(", getGesamt=");
		builder.append(getGesamt());
		builder.append("]");
		return builder.toString();
	}

	

}
