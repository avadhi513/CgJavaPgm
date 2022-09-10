package org.test;

public class Bank implements I1, I2 {
	
	private void educationLoan() {
		System.out.println("10%");
	}
	
	private void homeLoan() {
		System.out.println("11%");
	}
	
	@Override
	public void healthInsurance() {
		System.out.println("Health Insurance");		
	}
	
	@Override
	public void vehicleInsurance() {
		System.out.println("Vehicle Insurance");		
	}
	
	@Override
	public void lifeInsurance() {
		System.out.println("Life Insurance");	
	}
	
	@Override
	public void carInsurance() {
		System.out.println("Car");		
	}
		
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.educationLoan();
		b.homeLoan();
		
		b.healthInsurance();
		b.vehicleInsurance();
		
		b.lifeInsurance();
		b.carInsurance();
		
	}

}
