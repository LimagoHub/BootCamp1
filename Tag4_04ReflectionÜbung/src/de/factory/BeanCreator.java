package de.factory;

import java.util.Scanner;

public class BeanCreator {
	
	public Object createAndFillBean(String fullQualifiedClassName) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. Instanz der Klasse erstellen
		
		// 2. 
		System.out.println("Bitte wert eingeben:");
		String zeile = scanner.nextLine();
		System.out.println(zeile);
		return null;
	}

}
