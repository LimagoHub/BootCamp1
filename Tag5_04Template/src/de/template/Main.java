package de.template;

public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor =new FileProcessor();
		fileProcessor.addCharacterListener(new CharacterCounter());
		fileProcessor.addCharacterListener(new LineCounter());
		
		
		fileProcessor.run("baer.txt");

	}

}
