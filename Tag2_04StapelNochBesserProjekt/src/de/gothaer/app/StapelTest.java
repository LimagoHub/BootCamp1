package de.gothaer.app;

import de.gothaer.collections.Stapel;
import de.gothaer.geometrie.Kreis;
import de.gothaer.geometrie.Punkt;
import de.gothaer.tiere.Schwein;

public class StapelTest {

	public static void main(String[] args) {

		Stapel<Punkt> myStapel = new Stapel<>(40);
		
		for (int i = 0; i < 10; i++) {
			if(! myStapel.isFull()) {
				//myStapel.push(i);
				//myStapel.push(new Schwein("Schwein Nr." + i));
				myStapel.push(new Punkt(i,i));
				myStapel.push(new Kreis(i));
			}
		}
		
		while( ! myStapel.isEmpty()) {
			Punkt p =  myStapel.pop();
			p.rechts();
			System.out.println(p);
		}
//		
//		String text = "123";
//	
//		int a = Integer.valueOf(text);
//		
//		
//		text = Integer.toString(a);
//		
//		String dtext = "3.14";
//		
//		double d = Double.valueOf(dtext);
//		
//		dtext = Double.toString(d);
		
		
	}

}
