package com.ublwarriors.commandpattern.remote.command;

import com.ublwarriors.commandpattern.remote.obj.Light;

public class LightOnCommand implements Command{
	Light light;
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	public void execute()
	{
		light.on();
	}
	
}
