package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class NormalIndividual {
	protected boolean isDead = false;
	protected boolean hasProgrammingSkills = false;
	protected boolean isTired = false;
	protected boolean isSleeping = false;
		
	protected CoffeeMachine myCoffeeMachine;
	protected CoffeeMug myCoffeeMug;
	protected MicrowaveHoven myMicrowaveHoven;

	public NormalIndividual() {
		this.born();
		this.hasProgrammingSkills = false;
		
		getsACoffeeMachine();
		buyAMicrowaveHoven();
	}
	
	protected void born() {
		this.isDead = false;
		System.out.println("Individual borns.");
	}
	
	public void getsACoffeeMachine() {
		// Individual buys a coffee machine
		this.myCoffeeMachine = new CoffeeMachine();
		
		// Also buys a coffee mug
		this.myCoffeeMug = new CoffeeMug();
		
		System.out.println("Individual bought a coffee machine... and a coffee mug because it would stupid to drink coffee in a glass.");
	}
	
	public void buyAMicrowaveHoven() {
		this.myMicrowaveHoven = new MicrowaveHoven();
		
		System.out.println("Individual brings back Microwave hoven at home.");
	}
	
	public void pourACoffeeMug() {
		if (this.myCoffeeMachine.isEmpty()) {
			this.myCoffeeMachine.brewCoffee();
		}
		Coffee coffee = this.myCoffeeMachine.pourCoffee(CoffeeMug.CAPACITY);
		this.myCoffeeMug.refillWith(coffee);
	}
	
	public void drinkCoffee() {
		if (this.myCoffeeMug.isEmpty()) {
			pourACoffeeMug();
		}
		this.myCoffeeMug.drink(CoffeeMug.CAPACITY);
	}
	
	public void work() {
		System.out.println("Individual is working. He(she) gets tired!");
		
		// When work is done, individual is tired.
		this.isTired = true;
	}
	
	public void goToSleep() {
		this.isSleeping = true;
		System.out.println("Individual is tired and gets to sleep.");
		this.isTired = false;
		System.out.println("8 hours later, he(she) is well rested.");
	}
	
	public void wakeUp() {
		if (!this.isTired()) {
			this.isSleeping = false;
		}
		System.out.println("Individual wakes up!");
	}
	
	public void die() {
		this.isDead = true;
		System.out.println("Sadly, individual is dead!");
	}
	
	public boolean hasProgrammingSkills() { return this.hasProgrammingSkills; }
	
	public boolean isTired() { return this.isTired; }
	public boolean isSleeping() { return this.isSleeping; }
	public boolean isDead() { return this.isDead; }

}
