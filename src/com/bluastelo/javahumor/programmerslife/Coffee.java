package com.bluastelo.javahumor.programmerslife;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class Coffee {
	protected int quantity = 0; // In milliliter 

	public Coffee(int quantity) {
		this.quantity = quantity;
	}
	
	public void drink(int quantity) {
		int realQuantity = quantity;
		if (realQuantity > this.quantity)
		{
			realQuantity = this.quantity;
		}
		this.quantity -= realQuantity;
		if (isEmpty())
		{
			System.out.println("Individual decided to drink " + quantity + "ml of coffee. But there were not enough coffee. Now it's empty.");
		}
		else
		{
			System.out.println("Individual drank " + realQuantity + "ml of coffee. Now, it remains " + remainQuantity() + "ml.");
		}
	}
	
	public boolean isEmpty() {
		return (this.quantity == 0);
	}
	
	public int remainQuantity() {
		return getQuantity();
	}
	
	public int getQuantity() {
		return this.quantity;
	}

}
