package de.gothaer.collections;

/**
 * Formalen Kommentare (fachliche Beschreibung
 * @author JoachimWagner
 *
 */
public class Stapel {
	private static final int DEFAULT_SIZE = 10;
	private int [] data;
	private int index;
	
	public Stapel() {
		this(DEFAULT_SIZE);
	}

	public Stapel(int groesse) {
		data = new int[groesse < 1 ? DEFAULT_SIZE : groesse];
		index = 0;
	}

	/**
	 * Bla, bla...
	 * @param wert Der teller der in den Speicher fällt
	 */
	public void push(int wert) {
		if(isFull())
			return ;
		data[index++] = wert;
	}
	
	/**
	 * Bla, bla....
	 * @return der oberste Teller
	 */
	public int pop() {
		if(isEmpty())
			return 0;
		return data[--index];
	}
	
	public boolean isEmpty() {
		return index <= 0;
	}
	public boolean isFull() {
		return index >= data.length;
	}
}
