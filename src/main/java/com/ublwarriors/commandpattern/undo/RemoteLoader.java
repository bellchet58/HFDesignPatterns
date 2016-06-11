package com.ublwarriors.commandpattern.undo;

import com.ublwarriors.commandpattern.remote.obj.Stereo;
import com.ublwarriors.commandpattern.undo.command.CeilingFanHighCommand;
import com.ublwarriors.commandpattern.undo.command.CeilingFanMediumCommand;
import com.ublwarriors.commandpattern.undo.command.CeilingFanOffCommand;
import com.ublwarriors.commandpattern.undo.command.Command;
import com.ublwarriors.commandpattern.undo.command.HottubOffCommand;
import com.ublwarriors.commandpattern.undo.command.HottubOnCommand;
import com.ublwarriors.commandpattern.undo.command.LightOffCommand;
import com.ublwarriors.commandpattern.undo.command.LightOnCommand;
import com.ublwarriors.commandpattern.undo.command.MacroCommand;
import com.ublwarriors.commandpattern.undo.command.StereoOffCommand;
import com.ublwarriors.commandpattern.undo.command.StereoOnCommand;
import com.ublwarriors.commandpattern.undo.command.TVOffCommand;
import com.ublwarriors.commandpattern.undo.command.TVOnCommand;
import com.ublwarriors.commandpattern.undo.obj.CeilingFan;
import com.ublwarriors.commandpattern.undo.obj.Hottub;
import com.ublwarriors.commandpattern.undo.obj.Light;
import com.ublwarriors.commandpattern.undo.obj.TV;

public class RemoteLoader {
	 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		remoteControl = new RemoteControlWithUndo();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
