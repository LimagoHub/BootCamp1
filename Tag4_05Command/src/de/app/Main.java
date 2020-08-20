package de.app;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
		
			while (true) {
				
				System.out.print("#>");
				String zeile = scanner.nextLine();
				
				if("ende".equalsIgnoreCase(zeile)) break;
				
				Command command = CommandFactory.createCommand(zeile);
				if(command == null) continue;
				
				command.execute();
			
			}
		}

	}

}
