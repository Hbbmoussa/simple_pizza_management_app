package App;

import java.util.ArrayList;

import App_Enum.PizzaSizes;
import Pizzas.Pizza;
import Pizzas.PizzaOrder;
import Services.PizzaManagement;

public class RunTime {

	public static void main(String[] args) {
		
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

		Pizza pizza1 = new Pizza(PizzaSizes.LARGE,1,2,1);
		Pizza pizza2 = new Pizza(PizzaSizes.MEDIUM,1,2,1);
		Pizza pizza3 = new Pizza(PizzaSizes.SMALL,1,2,1);
		
		pizzas.add(pizza1);
		pizzas.add(pizza2);
		pizzas.add(pizza3);
				
		PizzaManagement managment = new PizzaManagement();
		
		double costPizza1 = managment.calcCost(pizza1);
		double costPizza2 = managment.calcCost(pizza2);
		double costPizza3 = managment.calcCost(pizza3);
		
		System.out.println("Pizza1 cost : "+costPizza1);
		System.out.println("Pizza1 cost : "+costPizza2);
		System.out.println("Pizza1 cost : "+costPizza3);
		
		double totalCost = managment.totalCost(pizzas);
		
		System.out.println("Total Cost of order : "+ totalCost);
	}

}
