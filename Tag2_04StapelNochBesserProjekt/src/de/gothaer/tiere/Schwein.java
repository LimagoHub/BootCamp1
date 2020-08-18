package de.gothaer.tiere;

public class Schwein {
	
	
	// Instanzvariablen
	private String name;
	private int gewicht;
	
	// Klassenvariable
	private static int counter;
	
	
	// Klassenmethode = Funktion
	public static int getCounter() {
		return counter;
	}

	// Klassenkonstruktor
	static {
		
		counter = 0;
	}
	
	// Instanzkonstruktor
	public Schwein() {
		this("nobody");
	}
	
	// Instanzkonstruktor
	public Schwein(String name) {
		this.name = name;
		this.gewicht = 10;
		counter ++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Quiiiieeeeek");
		counter --;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		
		this.name = name;
	}


	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		if(gewicht < 10)
			return ;
		this.gewicht = gewicht;
	}

	// Instanzmethoden
	public void fressen() {
		//gewicht ++;
	
		this.setGewicht(this.getGewicht() + 1); 
	}

	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}
	
	

}
