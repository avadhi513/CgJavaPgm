package org.test;

public class NewBank extends RBIBank {
	
	private void educationLoan() {
		System.out.println("10%");
	}
	
	private void homeLoan() {
		System.out.println("11%");
	}
	
	@Override
	public void savingsAcc() {
		System.out.println("15%");
	}
	
	@Override
	public void checkingsAcc() {
		System.out.println("20%");
	}
	
	public static void main(String[] args) {
		
		NewBank nb = new NewBank();
		nb.educationLoan();
		nb.homeLoan();
		
		nb.savingsAcc();
		nb.checkingsAcc();
		
		nb.jointAcc();
		
	}

}
