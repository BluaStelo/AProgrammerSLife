package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class MicrowaveHoven {
	public static final int WAITING = 100;

	public MicrowaveHoven() {
		System.out.println("There's a new microwave hoven in town.");
	}
	
	public void heat(Object object) {
		System.out.println("Microwave hoven is heating " + object.getClass().getSimpleName() + ". Please wait.");
		/*try {
			Thread.sleep(WAITING);
		} catch (InterruptedException e) {
			// DO NOTHING
		}*/
	}

}
