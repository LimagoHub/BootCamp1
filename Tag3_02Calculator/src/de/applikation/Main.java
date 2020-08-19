package de.applikation;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.math.CalculatorFactory;

public class Main {

	public static void main(String[] args) {
		
		
		
		CalcClient client = new CalcClient(CalculatorFactory.create());
		client.run();
	}

}
