package de.commands;

public class CommandFactory { 
	private static final String PREFIX ="de.commands.";
	private static final String SUFFIX ="Command";
	public static Command createCommand(String zeile) {
		
		try {
			String [] tokens = zeile.split(" ");
			
			Command retval = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).newInstance() ;
			retval.parse(tokens);
			
			return retval;
		}  catch (Throwable e) {
			System.out.println(e.getMessage());
			return null;
		} 
	}

}
