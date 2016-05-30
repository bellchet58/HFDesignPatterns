package com.ublwarriors.decoratorpattern;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	public Soy(Beverage ber)
	{
		beverage = ber;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+.15;
	}

}
