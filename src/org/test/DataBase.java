package org.test;

public class DataBase {
	
	// Depends on Data Type
	
	private void findEmployee(String name) {
		System.out.println(name);
	}
	
	// Depends on Data Type Order
	
	private void findEmployee(int empId, String name) {
		System.out.println(empId+" "+name);
	}
	
	private void findEmployee(String name, int empId, double empSal) {
		System.out.println(name+" "+empId+" "+empSal);
	}
	
	// Depends on Length
	
	private void findEmployee(String name, int empId, double empSal, boolean empStatus) {
		System.out.println(name+" "+empId+" "+empSal+" "+empStatus);
	}
	
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.findEmployee("Susee");
		db.findEmployee(1234, "Java");
		db.findEmployee("Selenium", 2345, 45556.99);
		db.findEmployee("ABS", 4567, 655557.899, true);
	}

}
