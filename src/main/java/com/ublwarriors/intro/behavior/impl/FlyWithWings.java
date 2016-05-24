package com.ublwarriors.intro.behavior.impl;

import com.ublwarriors.intro.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

}
