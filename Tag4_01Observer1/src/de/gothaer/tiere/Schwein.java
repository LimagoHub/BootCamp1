package de.gothaer.tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein {
	
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	
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
	
	
	public void addPigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.add(listener);
	}
	public void removePigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.remove(listener);
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
		if(gewicht > 20)
			firePigTooFatEvent();
		this.gewicht = gewicht;
	}

	// Instanzmethoden
	public void fressen() {
		//gewicht ++;
	
		this.setGewicht(this.getGewicht() + 1); 
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

	
	private void firePigTooFatEvent() {
		for (PigTooFatListener listener : pigTooFatListeners) {
			listener.pigTooFat(this);
		}
	}
	

}
