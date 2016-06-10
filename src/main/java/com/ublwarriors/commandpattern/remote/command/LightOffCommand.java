package com.ublwarriors.commandpattern.remote.command;

import com.ublwarriors.commandpattern.remote.obj.Light;

public class LightOffCommand implements Command{
	
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}

}
