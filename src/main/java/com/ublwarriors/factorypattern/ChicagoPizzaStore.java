package com.ublwarriors.factorypattern;

import com.ublwarriors.factorypattern.pizzatype.ChicagoStyleCheesePizza;
import com.ublwarriors.factorypattern.pizzatype.ChicagoStyleClamPizza;
import com.ublwarriors.factorypattern.pizzatype.ChicagoStylePepperoniPizza;
import com.ublwarriors.factorypattern.pizzatype.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore  extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new ChicagoStyleCheesePizza();
		if(type.equals("veggie"))
			return new ChicagoStyleVeggiePizza();
		if(type.equals("clam"))
			return new ChicagoStyleClamPizza();
		if(type.equals("pepperoni"))
			return new ChicagoStylePepperoniPizza();
		else
			return null;
	}
	
}
