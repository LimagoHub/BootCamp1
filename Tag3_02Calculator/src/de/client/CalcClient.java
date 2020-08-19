package de.client;

import de.math.Calculator;

public class CalcClient {
	
	private final Calculator calculator;
	
	
	// Dependency Injection (Inversion Of Control)
	public CalcClient(final Calculator calculator) {
		this.calculator = calculator;
	}



	public void run() {
			
		System.out.println(calculator.add(3, 7));

	}

}
