package de.client;

import de.composite.AbstractKontoNode;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class Main {

	public static void main(String[] args) {

		KontoGruppe root = new KontoGruppe("Root");
		
		KontoGruppe e1_1 = new KontoGruppe("e1_1");
		root.appendChild(e1_1);
		
		
		KontoGruppe e1_2 = new KontoGruppe("e1_2");
		root.appendChild(e1_2);
		
		
		KontoGruppe e2_1_1 = new KontoGruppe("e2_1_1");
		e1_1.appendChild(e2_1_1);
		
		KontoGruppe e2_1_2 = new KontoGruppe("e2_1_2");
		e1_1.appendChild(e2_1_2);
		
		Konto e2_1_3 = new Konto("e2_1_3");
		e1_1.appendChild(e2_1_3);

		KontoGruppe e2_2_1 = new KontoGruppe("e2_2_1");
		e1_1.appendChild(e2_2_1);
		
		KontoGruppe e2_2_2 = new KontoGruppe("e2_2_2");
		e1_1.appendChild(e2_2_2);
		
		Konto e2_2_3 = new Konto("e2_2_3");
		e1_1.appendChild(e2_2_3);

		root.print();
		
	}
	
	

}
