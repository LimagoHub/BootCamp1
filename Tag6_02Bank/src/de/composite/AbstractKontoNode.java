package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.composite.visitors.KontenVisitor;

public abstract class AbstractKontoNode {
	
	private AbstractKontoNode parent = null;
	private String label;
	
	
	public AbstractKontoNode(String label) {
		this.label = label;
	}


	public AbstractKontoNode getParent() {
		return parent;
	}


	public void setParent(AbstractKontoNode parent) {
		this.parent = parent;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractKontoNode [parent=");
		builder.append(parent);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}


	public List<AbstractKontoNode> getChildren() {
		return Collections.emptyList();
	}
	
	public void print() {
//		Iterator<AbstractKontoNode> it = iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		iterator().forEachRemaining(e->System.out.println(e));
	}
	
	public Iterator<AbstractKontoNode> iterator() {
		List<AbstractKontoNode> liste = new ArrayList<>();
		iteratorImpl(liste);
		return liste.iterator();
	}
	
	private void iteratorImpl(List<AbstractKontoNode> liste) {
		liste.add(this);
		for(AbstractKontoNode child: getChildren()) {
			child.iteratorImpl(liste);
		}
	}
	
	public void iterate(KontenVisitor visitor) {
		Iterator<AbstractKontoNode> it = iterator();
		while(it.hasNext())
			it.next().accept(visitor);

	}
	
	public abstract void accept(KontenVisitor visitor) ;

}
