package de.math;

public class CalculatorImpl implements Calculator {
	
	protected  CalculatorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double add(double a, double  b) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}

	@Override
	public double sub(double a, double  b) {
		return a - b;
	}

}
