package de.template;

public class CharacterCounter extends AbstractFileProcessor {
	
	private int counter;
	
	@Override
	public void init() {
		counter = 0;
	}

	@Override
	public void process(char c) {
		counter ++;

	}

	@Override
	public void close() {
		System.out.println(counter);
	}
	
	

}
