package com.ublwarriors.commandpattern.remote.obj;

public class Light {

	String location = "";

	public Light(String location) {
		this.location = location;
	}
	
	public Light() {
	}

	public void on() {
		System.out.println(location + "Light is on");
	}

	public void off() {
		System.out.println(location + "Light is off");
	}
}