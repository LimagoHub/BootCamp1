package de.gothaer.collections;

/**
 * Formalen Kommentare (fachliche Beschreibung
 * @author JoachimWagner
 *
 */
public class Stapel<T> {
	
	private static final int DEFAULT_SIZE = 10;
	private T [] data;
	private int index;
	
	public Stapel() {
		this(DEFAULT_SIZE);
	}

	public Stapel(int groesse) {
		data = (T[]) new Object[groesse < 1 ? DEFAULT_SIZE : groesse];
		index = 0;
	}

	/**
	 * Bla, bla...
	 * @param wert Der teller der in den Speicher fällt
	 * @throws StapelException 
	 */
	public void push(T wert) throws StapelException {
		if(isFull())
			throw new StapelException("Overflow") ;
		data[index++] = wert;
	}
	
	/**
	 * Bla, bla....
	 * @return der oberste Teller
	 */
	public T pop() {
		if(isEmpty())
			return null;
		return data[--index];
	}
	
	public boolean isEmpty() {
		return index <= 0;
	}
	public boolean isFull() {
		return index >= data.length;
	}
}
