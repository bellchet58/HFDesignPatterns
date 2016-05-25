package com.ublwarriors.intro;

import com.ublwarriors.intro.behavior.impl.FlyNoWay;
import com.ublwarriors.intro.behavior.impl.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}

}
