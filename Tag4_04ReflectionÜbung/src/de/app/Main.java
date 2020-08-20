package de.app;

import de.factory.BeanCreator;

public class Main {

	public static void main(String[] args) {
		Object object = new BeanCreator().createAndFillBean("de.beans.Person");
		System.out.println(object);

		
//		// MetaInformation
//		Class clazz;
//		
//		// 1. Möglichkeit
//		clazz = Schwein.class;
//		
//		// 2. Möglichkeit
//		Schwein piggy = new Schwein();
//		clazz = piggy.getClass();
//		
//		// ----------------------------------
//		// 3. Möglichkeit
//		clazz = Class.forName("de.gothaer.tiere.Schwein");
//		
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getSimpleName());
//		System.out.println("-----------------");
//		
//		Method [] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
//
//		System.out.println("-----------------");
//		methods = clazz.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
//		
//		
//		Object o = clazz.newInstance(); // Beankonvention 1. paramerlosen Konstruktor, 2. Variablen via getter und setter 3. Serializable
//		System.out.println(o);
//		
//		Method method = clazz.getMethod("fressen");
//		method.invoke(o);
//		System.out.println(o);
//		
//		method = clazz.getDeclaredMethod("setGewicht", int.class);
//		method.setAccessible(true);
//		method.invoke(o, -100);
//		System.out.println(o);

	}

}
