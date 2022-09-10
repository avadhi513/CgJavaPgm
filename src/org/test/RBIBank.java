package org.test;

public abstract class RBIBank {
	
	// Abstract Methods / Unimplemented 
	
	public abstract void savingsAcc();
	
	public abstract void checkingsAcc();
	
	// Non-Abstract Methods
	
	public void jointAcc() {
		System.out.println("4%");
	}

}
