package de.template;

public class Main {

	public static void main(String[] args) {
		AbstractFileProcessor fileProcessor =new FileCopy();
		
		fileProcessor.run("baer.txt");

	}

}
