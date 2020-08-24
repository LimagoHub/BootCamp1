package de.gothaer.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageOutputStream;

import de.gothaer.tiere.Schwein;
import de.gothaer.tiere.SchweineMemento;

public class Main {

	public static void main(String[] args) throws Exception{

		Schwein piggy = new Schwein("Miss Piggy");
		
		System.out.println(piggy);
		
		SchweineMemento memento = piggy.getMemento();
		
		
		piggy.fressen();
		
		
		
		System.out.println(piggy);
		
		piggy.setMemento(memento);
		
		System.out.println(piggy);
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("piggy.schwein");
		
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		
		out.writeObject(piggy);
		
		out.close();
		
		FileInputStream fis = new FileInputStream("piggy.schwein");
		ObjectInputStream in = new ObjectInputStream(fis);
		piggy = (Schwein) in.readObject();
		
		in.close();
		
	
		
		

	}

}
