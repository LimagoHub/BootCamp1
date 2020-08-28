package de.gothaer.tiere;

public class Schwein {
	
	
	// Instanzvariablen
	private String name;
	private volatile int gewicht;
	
	

	
	// Instanzkonstruktor
	public Schwein() {
		this("nobody");
	}
	
	// Instanzkonstruktor
	public Schwein(String name) {
		this.name = name;
		this.gewicht = 10;
		
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
		
		this.gewicht = gewicht;
	}

	// Instanzmethoden
	public void fressen() {
		
		try {
			Thread.sleep(2000);
			gewicht ++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
