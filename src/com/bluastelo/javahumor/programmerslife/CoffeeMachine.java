package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class CoffeeMachine {
	// When coffee is brewed, machine turns off automatically.
	public static final boolean AUTOMATIC_COFFEE_MACHINE = true; 
	// Machine capacity
	public static final int CAPACITY = 1000; // In milliliter
	
	protected boolean isOn = false;
	protected int coffeeLoad = 0; // In milliliter

	public CoffeeMachine() {
		coffeeLoad = 0;
	}
	
	public void turnOn() {
		System.out.println("Coffee machine turns on.");
		isOn = true;
	}
	
	public void turnOff() {
		System.out.println("Coffee machine turns off.");
		isOn = false;
	}
	
	public void brewCoffee() {
		this.turnOn();
		System.out.println("Coffee machine is brewing coffee.");
		coffeeLoad = CAPACITY;
		System.out.println("Coffee is done. Now there is " + getCoffeeLoad() + "ml of hot coffee in the machine. Don't forget it or it will get cold.");
		if (AUTOMATIC_COFFEE_MACHINE) this.turnOff();
	}
	
	public Coffee pourCoffee(int quantity) {
		if (quantity > this.coffeeLoad) quantity = this.coffeeLoad;
		Coffee coffeeToPour = new Coffee(quantity);
		this.coffeeLoad -= quantity;
		System.out.println("Individual took " + quantity + "ml of coffee from the machine. Now " + getCoffeeLoad() + "ml remains in the machine.");
		return coffeeToPour;
	}
	
	public boolean isEmpty() {
		return (this.coffeeLoad == 0);
	}
	
	public int getCoffeeLoad() {
		return this.coffeeLoad;
	}

}
