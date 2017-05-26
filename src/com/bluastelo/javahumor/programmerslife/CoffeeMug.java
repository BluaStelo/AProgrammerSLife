package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class CoffeeMug {
	public static final int CAPACITY = 200; // In milliliter
	
	protected Coffee coffee;

	public CoffeeMug() {
		// Mug is empty at first
		coffee = null;
	}
	
	public CoffeeMug(Coffee coffee) {
		// There is coffee at start
		this.coffee = coffee;
	}
	
	public boolean isEmpty() {
		if (this.coffee == null)
			return true;
		return this.coffee.isEmpty();
	}
	
	public void refillWith(Coffee newCoffee) {
		this.coffee = newCoffee;
		System.out.println("Coffee mug was refilled.");
	}
	
	public void drink(int quantity) {
		this.coffee.drink(quantity);
	}

}
