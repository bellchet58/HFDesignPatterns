package com.ublwarriors.decoratorpattern;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	public Whip(Beverage berverage)
	{
		this.beverage = berverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+.1;
	}

}
