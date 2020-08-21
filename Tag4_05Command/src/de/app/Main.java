package de.app;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;
import de.commands.CommandHistory;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
		
			CommandHistory history = new CommandHistory();
			
			while (true) {
				
				System.out.print("#>");
				String zeile = scanner.nextLine();
				
				if("ende".equalsIgnoreCase(zeile)) break;
				if("undo".equals(zeile) || "redo".equals(zeile)) {
					if("undo".equals(zeile))
						history.undo();
					else
						history.redo();
					continue;
				}
				
				Command command = CommandFactory.createCommand(zeile);
				if(command == null) continue;
				
				command.execute();
				history.addCommand(command);
			
			}
		}

	}

}
