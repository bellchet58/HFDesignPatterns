package com.ublwarriors.factorypattern.di;

import com.ublwarriors.factorypattern.di.ingredients.Cheese;
import com.ublwarriors.factorypattern.di.ingredients.Clams;
import com.ublwarriors.factorypattern.di.ingredients.Dough;
import com.ublwarriors.factorypattern.di.ingredients.Pepperoni;
import com.ublwarriors.factorypattern.di.ingredients.Sauce;
import com.ublwarriors.factorypattern.di.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
 