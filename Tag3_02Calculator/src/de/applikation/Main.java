package de.applikation;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.math.CalculatorFactory;

public class Main {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		// ....
		Instant ende = Instant.now();
		
		Duration duration = Duration.between(start, ende);
		System.out.println("Duration = " + duration.toMillis());
		
		CalcClient client = new CalcClient(CalculatorFactory.create());
		client.run();
	}

}
