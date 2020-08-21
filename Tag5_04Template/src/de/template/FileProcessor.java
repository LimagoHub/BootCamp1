package de.template;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	
	
	private List<CharacterListener> listeners = new ArrayList<>();
	
	public void addCharacterListener(CharacterListener listener) {
		listeners.add(listener);
	}
	
	public void removeCharacterListener(CharacterListener listener) {
		listeners.remove(listener);
	}
	
	public final void run(String filename) {
		init();
		
		try(FileReader reader = new FileReader(filename)){
			int c;
			while( (c = reader.read()) != -1) {
				process((char) c);
			}
			
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void init() {
		for (CharacterListener listener : listeners) {
			listener.init();
		}
	}
	
	private void process(char c) {
		for (CharacterListener listener : listeners) {
			listener.process(c);
		}
	}

	private void close() {
		for (CharacterListener listener : listeners) {
			listener.close();
		}
	}
}
