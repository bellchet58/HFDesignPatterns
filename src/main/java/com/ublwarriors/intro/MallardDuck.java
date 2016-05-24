package com.ublwarriors.intro;

import com.ublwarriors.intro.behavior.impl.FlyWithWings;
import com.ublwarriors.intro.behavior.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real MallardDuck duck!");
	}

}
