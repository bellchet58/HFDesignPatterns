package com.ublwarriors.commandpattern.remote.command;

import com.ublwarriors.commandpattern.remote.obj.Stereo;

public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
}
