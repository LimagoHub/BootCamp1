package de.demo;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class ArrayFiller {
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE / 2;
	private int [] feld;

	public static void main(String[] args) {
		new ArrayFiller().go();

	}

	private void go() {
		feld = new int[MAX_ARRAY_SIZE];
		Instant start = Instant.now();
		Random random = new Random();
		for(int i = 0 ; i < MAX_ARRAY_SIZE; i++) {
			feld[i] = random.nextInt();
		}
		Instant ende = Instant.now();
		Duration duration = Duration.between(start, ende);
		System.out.println(duration.toMillis());
	}

}
