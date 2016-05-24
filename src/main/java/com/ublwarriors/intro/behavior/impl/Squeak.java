package com.ublwarriors.intro.behavior.impl;

import com.ublwarriors.intro.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
