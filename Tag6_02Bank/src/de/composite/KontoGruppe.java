package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.composite.visitors.KontenVisitor;

public class KontoGruppe extends AbstractKontoNode {
	
	private List<AbstractKontoNode> children = new ArrayList<>();

	public KontoGruppe(String label) {
		super(label);
	}

	@Override
	public List<AbstractKontoNode> getChildren() {
		return Collections.unmodifiableList(children);
	}
	
	public void appendChild(AbstractKontoNode child) {
		child.setParent(this);
		children.add(child);
	}
	public void removeChild(AbstractKontoNode child) {
		child.setParent(null);
		children.remove(child);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KontoGruppe [getParent()=");
		builder.append(getParent());
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
