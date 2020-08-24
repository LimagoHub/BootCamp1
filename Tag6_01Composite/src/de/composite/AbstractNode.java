package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractNode {
	
	private AbstractNode parent = null;
	private String label;
	
	
	public AbstractNode(String label) {
		this.label = label;
	}


	public AbstractNode getParent() {
		return parent;
	}


	public void setParent(AbstractNode parent) {
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
		builder.append("AbstractNode [parent=");
		builder.append(parent);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
	public List<AbstractNode> getChildren() {
		return Collections.emptyList();
	}

}
