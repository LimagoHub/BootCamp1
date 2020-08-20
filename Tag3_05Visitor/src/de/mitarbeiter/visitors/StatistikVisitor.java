package de.mitarbeiter.visitors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public class StatistikVisitor implements MitarbeiterVisitor {
	private int gehaltsempf�ngerZ�hler;
	private int lohnempf�ngerZ�hler;
	

	@Override
	public void init() {
		gehaltsempf�ngerZ�hler = 0;
		lohnempf�ngerZ�hler = 0;

	}

	@Override
	public void visit(GehaltsEmpf�nger gehaltsEmpf�nger) {
		gehaltsempf�ngerZ�hler ++;

	}

	@Override
	public void visit(LohnEmpf�nger lohnEmpf�nger) {
		lohnempf�ngerZ�hler ++;

	}

	@Override
	public void dispose() {
		System.out.println(this);

	}

	public int getGehaltsempf�ngerZ�hler() {
		return gehaltsempf�ngerZ�hler;
	}

	
	public int getLohnempf�ngerZ�hler() {
		return lohnempf�ngerZ�hler;
	}


	public int getGesamt() {
		return lohnempf�ngerZ�hler + gehaltsempf�ngerZ�hler;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [getGehaltsempf�ngerZ�hler=");
		builder.append(getGehaltsempf�ngerZ�hler());
		builder.append(", getLohnempf�ngerZ�hler=");
		builder.append(getLohnempf�ngerZ�hler());
		builder.append(", getGesamt=");
		builder.append(getGesamt());
		builder.append("]");
		return builder.toString();
	}

	

}
