package de.template;

public class LineCounter extends AbstractCharacterListener  {
	
	private int counter;
	
	@Override
	public void init() {
		counter = 0;
	}

	@Override
	public void process(char c) {
		if(c == '\n')
			counter ++;

	}
	
	@Override
	public void close() {
		System.out.println(counter);
	}

}
