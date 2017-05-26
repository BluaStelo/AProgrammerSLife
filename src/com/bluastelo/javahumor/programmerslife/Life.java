package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class Life {
	protected static Programmer programmer;

	public static void main(String[] args) {
		programmer = new Programmer();
		
		System.out.println("Programmer everyday life starts in 3 seconds.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Do nothing
		}
		
		
		programmer.liveEverydayRoutine();
	}

}
