package com.ublwarriors.intro.behavior.impl;

import com.ublwarriors.intro.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I canot fly");
	}

}
