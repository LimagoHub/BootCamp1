package de.applikation;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Main {

	public static void main(String[] args) {
		Calculator calculator /* 1000 */ = new CalculatorImpl(); // 1000
		calculator /* 2000 */ = new CalculatorLogger(calculator /* 1000 */);
		calculator /* 3000 */ = new CalculatorSecure(calculator /* 2000 */);
		
		CalcClient client = new CalcClient(calculator);
		client.run();
	}

}
