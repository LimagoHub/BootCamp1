package de.commands;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
	
	
	private Deque<Command> undoQueue = new ArrayDeque<>();
	private Deque<Command> redoQueue = new ArrayDeque<>();
	
	public void addCommand(Command command) {
		if(command.isQuery()) return;
		undoQueue.push(command);
		redoQueue.clear();
		
	}
	
	public void undo() {
		if(undoQueue.isEmpty()) {
			System.out.println("can't undo");
		} else {
			Command command = undoQueue.pop();
			command.undo();
			redoQueue.push(command);
		}
	}
 
	
	public void redo() {
		if(redoQueue.isEmpty()) {
			System.out.println("can't redo");
		} else {
			Command command = redoQueue.pop();
			command.execute();
			undoQueue.push(command);
		}
	}

}
