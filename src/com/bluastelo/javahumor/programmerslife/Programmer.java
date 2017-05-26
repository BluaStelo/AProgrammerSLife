package com.bluastelo.javahumor.programmerslife;

import java.util.Random;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class Programmer extends NormalIndividual {
	public static final int THREAD_SLEEPING = 100;
	protected KnownProgrammingLanguages knownProgrammingLanguages = null;
	protected Computer myComputer;

	public Programmer() {
		// Programmer born
		// Programmer gets a coffee machine and a microwave hoven
		super();
		// And yet has no programming skills
		
		
		
		// Buys a computer
		this.buyAComputer();
		
		// Learns programming
		this.learnProgramming();
		// And now has programming skills!
	}
	
	public void liveEverydayRoutine() {
		do {
			// Every day
			this.wakeUp();
			this.myComputer.turnOn();
//			this.myCoffeeMachine.brewCoffee();
//			this.programOneHour();
			// You forgot coffee, now it's cold.
			do {
				// Every hour
				if (this.myCoffeeMachine.isEmpty())
				{
					this.myCoffeeMachine.brewCoffee();
				}
				this.pourACoffeeMug();
				this.myMicrowaveHoven.heat(this.myCoffeeMug);
				
				this.programOneHour();
				
			} while (!this.isTired());
			
			this.myComputer.shutdown();
			this.goToSleep();
			/*try {
				Thread.sleep(THREAD_SLEEPING);
			} catch (InterruptedException e) {
				// DO NOTHING
			}*/
			this.mayDieRandomly();
		} while (!this.isDead());
		
		// END - It was a happy life!
		System.out.println("END! It was a happy life.");
	}
	
	protected void learnProgramming() {
		this.knownProgrammingLanguages = new KnownProgrammingLanguages();
		
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Quick BASIC"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("HP RPL"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Turbo Forth"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Perl"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("PHP"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("C#"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Java"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Java for Android"));
		this.knownProgrammingLanguages.add(new ProgrammingLanguage("Swift"));

		this.hasProgrammingSkills = true;
	}
	
	public void programOneHour() {
		if (this.hasProgrammingSkills()) {
			ProgrammingLanguage language = this.knownProgrammingLanguages.getRandomLanguage();
			
			// Program while drinking coffee!
			this.myComputer.programOneHour(language, myCoffeeMug);
		}
		
		// Always drink coffee while programming 
		
		// May get tired
		Random random = new Random();
		if (random.nextInt(12) == 0) {
			// Programmer has one chance over 12 of getting tired.
			this.isTired = true;
		}
	}
	
	protected void buyAComputer() {
		this.myComputer = new Computer();
		System.out.println("Individual bought this new computer.");
	}
	
	public void mayDieRandomly() {
		int OneChanceOver = 
				70 // years of life expectation
				* 365; // days per year
		Random random = new Random();
		if (random.nextInt(OneChanceOver) == (OneChanceOver - 1)) {
			// Bad luck today, you die
			this.die();
		}
	}
	

}
