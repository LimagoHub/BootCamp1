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
	
	public Stapel() throws StapelException {
		this(DEFAULT_SIZE);
	}

	public Stapel(int groesse) throws StapelException {
		try {
			data = (T[]) new Object[groesse];
			index = 0;
		} catch (RuntimeException e) {
			throw new StapelException("Init", e);
		}
	}

	/**
	 * Bla, bla...
	 * @param wert Der teller der in den Speicher fällt
	 * @throws StapelException 
	 */
	public void push(T wert) throws StapelException {
		
		try {
			data[index++] = wert;
		} catch (RuntimeException e) {
			throw new StapelException("Overflow",e);
		}
	}
	
	/**
	 * Bla, bla....
	 * @return der oberste Teller
	 * @throws StapelException 
	 */
	public T pop() throws StapelException {
		if(isEmpty())
			throw new StapelException("Underflow");
		return data[--index];
	}
	
	public boolean isEmpty() {
		return index <= 0;
	}
	public boolean isFull() {
		return index >= data.length;
	}
}
