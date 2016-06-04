package com.ublwarriors.factorypattern.di.factoryimpl;

import com.ublwarriors.factorypattern.di.PizzaIngredientFactory;
import com.ublwarriors.factorypattern.di.ingredients.Cheese;
import com.ublwarriors.factorypattern.di.ingredients.Clams;
import com.ublwarriors.factorypattern.di.ingredients.Dough;
import com.ublwarriors.factorypattern.di.ingredients.Pepperoni;
import com.ublwarriors.factorypattern.di.ingredients.Sauce;
import com.ublwarriors.factorypattern.di.ingredients.Veggies;
import com.ublwarriors.factorypattern.di.ingredients.impl.BlackOlives;
import com.ublwarriors.factorypattern.di.ingredients.impl.EggPlant;
import com.ublwarriors.factorypattern.di.ingredients.impl.FrozenClams;
import com.ublwarriors.factorypattern.di.ingredients.impl.Mozzarella;
import com.ublwarriors.factorypattern.di.ingredients.impl.PlumTomatoSauce;
import com.ublwarriors.factorypattern.di.ingredients.impl.SlicedPepperoni;
import com.ublwarriors.factorypattern.di.ingredients.impl.Spinach;
import com.ublwarriors.factorypattern.di.ingredients.impl.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new EggPlant(),new Spinach(),new BlackOlives()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
