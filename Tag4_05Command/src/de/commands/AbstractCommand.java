package de.commands;

public abstract class AbstractCommand implements Command{

	@Override
	public void parse(String[] tokens) {
		// ok
		
	}


	@Override
	public void undo() {
		throw new UnsupportedOperationException("upps");
		
	}

	@Override
	public boolean isQuery() {
		
		return true;
	}

}
