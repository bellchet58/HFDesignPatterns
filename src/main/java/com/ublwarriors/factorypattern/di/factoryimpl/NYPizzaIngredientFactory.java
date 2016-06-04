package com.ublwarriors.factorypattern.di.factoryimpl;

import com.ublwarriors.factorypattern.di.PizzaIngredientFactory;
import com.ublwarriors.factorypattern.di.ingredients.Cheese;
import com.ublwarriors.factorypattern.di.ingredients.Clams;
import com.ublwarriors.factorypattern.di.ingredients.Dough;
import com.ublwarriors.factorypattern.di.ingredients.Pepperoni;
import com.ublwarriors.factorypattern.di.ingredients.Sauce;
import com.ublwarriors.factorypattern.di.ingredients.Veggies;
import com.ublwarriors.factorypattern.di.ingredients.impl.FreshClams;
import com.ublwarriors.factorypattern.di.ingredients.impl.Garlic;
import com.ublwarriors.factorypattern.di.ingredients.impl.MarinaraSauce;
import com.ublwarriors.factorypattern.di.ingredients.impl.Mushroom;
import com.ublwarriors.factorypattern.di.ingredients.impl.Onion;
import com.ublwarriors.factorypattern.di.ingredients.impl.RedPepper;
import com.ublwarriors.factorypattern.di.ingredients.impl.ReggianoCheese;
import com.ublwarriors.factorypattern.di.ingredients.impl.SlicedPepperoni;
import com.ublwarriors.factorypattern.di.ingredients.impl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough()
	{
		return new ThinCrustDough();
	}
	
	public Sauce createSauce()
	{
		return new MarinaraSauce();
	}
	
	public Cheese createCheese()
	{
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies()
	{
		Veggies veggies[] = { new Garlic(),new Onion(),new Mushroom(), new RedPepper()};
		return veggies;
	}
	
	public Pepperoni createPepperoni(){
		return new SlicedPepperoni();
	}
	
	public Clams createClam()
	{
		return new FreshClams();
	}
}
