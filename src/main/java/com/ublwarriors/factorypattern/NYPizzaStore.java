package com.ublwarriors.factorypattern;

import com.ublwarriors.factorypattern.pizzatype.NYStyleCheesePizza;
import com.ublwarriors.factorypattern.pizzatype.NYStyleClamPizza;
import com.ublwarriors.factorypattern.pizzatype.NYStylePepperoniPizza;
import com.ublwarriors.factorypattern.pizzatype.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new NYStyleCheesePizza();
		else if(type.equals("veggie"))
			return new NYStyleVeggiePizza();
		else if (type.equals("clam"))
			return new NYStyleClamPizza();
		else if (type.equals("pepperoni"))
			return new NYStylePepperoniPizza();
		else
			return null;
	}

}
