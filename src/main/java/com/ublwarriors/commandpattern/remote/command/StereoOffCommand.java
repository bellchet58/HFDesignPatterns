package com.ublwarriors.commandpattern.remote.command;

import com.ublwarriors.commandpattern.remote.obj.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
