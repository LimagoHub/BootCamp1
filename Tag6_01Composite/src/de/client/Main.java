package de.client;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

	public static void main(String[] args) {

		Node root = new Node("Root");
		
		Node e1_1 = new Node("e1_1");
		root.appendChild(e1_1);
		
		
		Node e1_2 = new Node("e1_2");
		root.appendChild(e1_2);
		
		
		Node e2_1_1 = new Node("e2_1_1");
		e1_1.appendChild(e2_1_1);
		
		Node e2_1_2 = new Node("e2_1_2");
		e1_1.appendChild(e2_1_2);
		
		Leaf e2_1_3 = new Leaf("e2_1_3");
		e1_1.appendChild(e2_1_3);

		Node e2_2_1 = new Node("e2_2_1");
		e1_1.appendChild(e2_2_1);
		
		Node e2_2_2 = new Node("e2_2_2");
		e1_1.appendChild(e2_2_2);
		
		Leaf e2_2_3 = new Leaf("e2_2_3");
		e1_1.appendChild(e2_2_3);

		travers(root);
	}
	
	public static void travers(AbstractNode node) {
		System.out.println(node);
		for(AbstractNode child : node.getChildren()) {
			travers(child);
		}
	}

}
