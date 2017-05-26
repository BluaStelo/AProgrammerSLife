package com.bluastelo.javahumor.programmerslife;

import java.util.Random;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class Computer {
	protected boolean isOn = false;

	public Computer() {
		System.out.println("There is a new computer!");
	}
	
	public void turnOn() {
		isOn = true;
		System.out.println("Computer is turning on.");
	}
	
	public void shutdown() {
		isOn = false;
		System.out.println("Computer is shutting down");
	}
	
	public boolean isRunning() {
		return this.isOn;
	}
	
	public void programOneHour(ProgrammingLanguage language, CoffeeMug coffeeMug) {
		// During one hour
		// Program with language
		System.out.println("Individual programs with " + language.getLanguageName() + ".");
		// And always drink coffee from the mug
		Random random = new Random();
		
		do {
			coffeeMug.drink(random.nextInt(CoffeeMug.CAPACITY));
		} while (!coffeeMug.isEmpty());
		
		System.out.println("Damn, coffee mug is empty!");
	}

}
