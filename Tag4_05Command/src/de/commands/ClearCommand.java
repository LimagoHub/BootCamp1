package de.commands;

import de.math.Calculator;

public class ClearCommand extends AbstractCommand{
	
	private double oldValue;

	@Override
	public void execute() {
		Calculator calculator = Calculator.getInstance();
		oldValue = calculator.getMemory();
		calculator.clear();
		
	}

	@Override
	public void undo() {
		Calculator.getInstance().setMemory(oldValue);
	}

	@Override
	public boolean isQuery() {
		return false;
	}

}
