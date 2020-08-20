package de.factory;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanCreator {
	
	private final static String PREFIX = "set";
	
	public Object createAndFillBean(String fullQualifiedClassName) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			Object retval = Class.forName(fullQualifiedClassName).newInstance();
			for(Method m : retval.getClass().getDeclaredMethods()) {
				if(m.getName().startsWith(PREFIX)) {
					System.out.println(String.format("Bitte Wert für %s eingeben.", m.getName().substring(PREFIX.length())));
					m.invoke(retval, scanner.nextLine());
				}
			}
			
			return retval;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	
	}

}
