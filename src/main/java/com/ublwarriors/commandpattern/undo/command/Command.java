package com.ublwarriors.commandpattern.undo.command;

public interface Command {
	public void execute();
	public void undo();
}
