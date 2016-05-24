package com.ublwarriors.intro.behavior.impl;

import com.ublwarriors.intro.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
