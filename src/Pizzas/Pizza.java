package Pizzas;

import App_Enum.CostBySize;
import App_Enum.PizzaSizes;

public class Pizza {
	
	private PizzaSizes p_sizes;
	private int nb_of_cheese_top;
	private int nb_of_pepperoni_top;
	private int nb_of_ham_top;
	
	public Pizza(PizzaSizes p_sizes, int nb_of_cheese_top, int nb_of_pepperoni_top, int nb_of_ham_top) {
		super();
		this.p_sizes = p_sizes;
		this.nb_of_cheese_top = nb_of_cheese_top;
		this.nb_of_pepperoni_top = nb_of_pepperoni_top;
		this.nb_of_ham_top = nb_of_ham_top;
	}

	public PizzaSizes getP_sizes() {
		return p_sizes;
	}

	public void setP_sizes(PizzaSizes p_sizes) {
		this.p_sizes = p_sizes;
	}

	public int getNb_of_cheese_top() {
		return nb_of_cheese_top;
	}

	public void setNb_of_cheese_top(int nb_of_cheese_top) {
		this.nb_of_cheese_top = nb_of_cheese_top;
	}

	public int getNb_of_pepperoni_top() {
		return nb_of_pepperoni_top;
	}

	public void setNb_of_pepperoni_top(int nb_of_pepperoni_top) {
		this.nb_of_pepperoni_top = nb_of_pepperoni_top;
	}

	public int getNb_of_ham_top() {
		return nb_of_ham_top;
	}

	public void setNb_of_ham_top(int nb_of_ham_top) {
		this.nb_of_ham_top = nb_of_ham_top;
	}
	
	
}
