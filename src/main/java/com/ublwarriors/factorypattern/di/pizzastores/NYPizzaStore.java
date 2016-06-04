package com.ublwarriors.factorypattern.di.pizzastores;

import com.ublwarriors.factorypattern.di.PizzaIngredientFactory;
import com.ublwarriors.factorypattern.di.factoryimpl.NYPizzaIngredientFactory;
import com.ublwarriors.factorypattern.di.pizzas.CheesePizza;
import com.ublwarriors.factorypattern.di.pizzas.ClamPizza;
import com.ublwarriors.factorypattern.di.pizzas.PepperoniPizza;
import com.ublwarriors.factorypattern.di.pizzas.Pizza;
import com.ublwarriors.factorypattern.di.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("Cheese"))
		{
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("veggies"))
		{
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		else if (item.equals("clam"))
		{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		else if(item.equals("pepperoni"))
		{
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}



}
