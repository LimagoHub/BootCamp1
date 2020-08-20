package de.gothaer.tiere;

import java.util.ArrayList;
import java.util.List;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

public class Schwein {
	
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<PropertyChangedListener>(); 
	
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
	
	public void addPropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		propertyChangedListeners.add(propertyChangedListener);
	}
	public void removePropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		propertyChangedListeners.remove(propertyChangedListener);
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
		firePropertyChanged("name", this.name, this.name = name);
	}


	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		if(gewicht < 10)
			return ;
		if(gewicht > 20)
			firePigTooFatEvent();
		firePropertyChanged("gewicht", this.gewicht, this.gewicht = gewicht);
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
	private void firePropertyChanged(String propertyname, Object oldValue, Object newValue) {
		firePropertyChanged(new PropertyChangedEvent(this, propertyname, oldValue, newValue));
	}
	private void firePropertyChanged(PropertyChangedEvent event) {
		for(PropertyChangedListener listener: propertyChangedListeners)
			listener.propertyChanged(event);
	}

}
