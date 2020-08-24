package de.gothaer.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Formalen Kommentare (fachliche Beschreibung
 * @author JoachimWagner
 *
 */
public class Stapel {
	private static final int DEFAULT_SIZE = 10;
	private List<Integer> data;
	
	
	public Stapel() {
		data = new ArrayList<Integer>();
	}

//	public Stapel(int groesse) {
//		data = new int[groesse < 1 ? DEFAULT_SIZE : groesse];
//		index = 0;
//	}

	/**
	 * Bla, bla...
	 * @param wert Der teller der in den Speicher fällt
	 */
	public void push(int wert) throws StapelException{
		if(isFull())
			throw new StapelException("Overflow") ;
		data.add(wert);
	}
	
	/**
	 * Bla, bla....
	 * @return der oberste Teller
	 */
	public int pop() {
		if(isEmpty())
			return 0;
		return data.remove(data.size() - 1);
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	public boolean isFull() {
		return false;
	}
}
