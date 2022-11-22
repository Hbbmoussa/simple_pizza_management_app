package Pizzas;


import java.util.ArrayList;

public class PizzaOrder {
	
	private ArrayList<Pizza> pizzas;

	public PizzaOrder(ArrayList<Pizza> pizzas) {
		super();
		this.pizzas = pizzas;
	}
	
	
	
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}



	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
}