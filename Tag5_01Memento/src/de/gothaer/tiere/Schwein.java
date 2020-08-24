package de.gothaer.tiere;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Schwein implements Serializable{
	

	private static final long serialVersionUID = -2128470139023416760L;
	// Instanzvariablen
	private String name;
	private int gewicht;
	private List<String> strings = Arrays.asList("a","b","c");
		

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
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	
	 private void readObject( ObjectInputStream ois ) throws IOException
	  {
	    try
	    {
	      ois.defaultReadObject(); // Lies Name, aber ohne Alter
	     
	      counter ++;
	    }
	    catch ( ClassNotFoundException e )
	    {
	      throw new IOException( "No class found. HELP!!" );
	    }
	  }
	
	 
	public Schwein clone() {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(this);
			oos.close();
			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream  ois = new ObjectInputStream(in);
			Schwein retval = (Schwein) ois.readObject();
			ois.close();
			return retval;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	 
	 
	public SchweineMemento getMemento() {
		return new MySchweineMemento(name, gewicht);
	}
	
	public void setMemento(SchweineMemento memento) {
		MySchweineMemento mySchweineMemento = (MySchweineMemento) memento;
		this.name = mySchweineMemento.getName();
		this.gewicht = mySchweineMemento.getGewicht();
	}

	private static class MySchweineMemento implements SchweineMemento {
		private final String name;
		private final int gewicht;
		public MySchweineMemento(String name, int gewicht) {
			super();
			this.name = name;
			this.gewicht = gewicht;
		}
		public String getName() {
			return name;
		}
		public int getGewicht() {
			return gewicht;
		}
		
	}
	
	

}
