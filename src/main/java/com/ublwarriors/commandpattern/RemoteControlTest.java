package com.ublwarriors.commandpattern;

import com.ublwarriors.commandpattern.remote.command.GarageDoorOpenCommand;
import com.ublwarriors.commandpattern.remote.command.LightOnCommand;
import com.ublwarriors.commandpattern.remote.obj.GarageDoor;
import com.ublwarriors.commandpattern.remote.obj.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand gargeDoorOpen = new GarageDoorOpenCommand(door);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(gargeDoorOpen);
		remote.buttonWasPressed();
	}
}
