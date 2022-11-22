package Services;

import java.util.ArrayList;

import App_Enum.CostBySize;
import App_Enum.PizzaSizes;
import Pizzas.Pizza;

public class PizzaManagement {
	public final int TOP_COST = 4;
	private double totalCost;

	
	/* Get the number of all the toppings inside the pizza*/
	public int nub_of_top(Pizza pizza) {
		return pizza.getNb_of_cheese_top() + pizza.getNb_of_pepperoni_top()+ pizza.getNb_of_ham_top();
	}
	/* Calcul the cost of one Pizza*/

	public double calcCost(Pizza pizza) {
		if(pizza.getP_sizes().equals(PizzaSizes.SMALL)) {
			return CostBySize.SMALL.getValue() + TOP_COST * nub_of_top(pizza);
		}
		if(pizza.getP_sizes().equals(PizzaSizes.MEDIUM)) {
			return CostBySize.MEDIUM.getValue() + TOP_COST * nub_of_top(pizza);
			
		}return CostBySize.LARGE.getValue() + TOP_COST * nub_of_top(pizza);
	}
	/* Calcul the cost of many Pizzas*/

	public double totalCost(ArrayList<Pizza> pizzas) {
		for(Pizza pizza : pizzas) {
			totalCost += calcCost(pizza);
		}
		return totalCost;
	}

}
