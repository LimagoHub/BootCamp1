package de.math;

public class CalculatorFactory {
	
	public static Calculator create() {
		Calculator calculator /* 1000 */ = new CalculatorImpl(); // 1000
		calculator /* 2000 */ = new CalculatorLogger(calculator /* 1000 */);
		calculator /* 3000 */ = new CalculatorSecure(calculator /* 2000 */);
		return calculator;
	}

}
