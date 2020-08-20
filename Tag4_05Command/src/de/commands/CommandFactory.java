package de.commands;

public class CommandFactory { 
	
	public static Command createCommand(String zeile) {
		Command retval = null;
		String [] tokens = zeile.split(" ");
		
		switch (tokens[0]) {
		case "Add":
			retval = new AddCommand();
			retval.parse(tokens);
			break;
		case "Print":
			retval = new PrintCommand();
			retval.parse(tokens);
			break;

		default:
			break;
		}
		
		return retval;
	}

}
