package org.test;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// empId
		System.out.println("Enter Employee ID");
		String empId = sc.next();
		System.out.println("Employee Id is: "+empId);
		
		// empName
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		System.out.println("Employee Name is: "+empName);
		
		// empEmail
		System.out.println("Enter Employee Email Address");
		String empEmail = sc.next();
		System.out.println("Employee Email is: "+empEmail);
		
		// empPhoneno
		System.out.println("Enter Employee Phone Number");
		long empPhoneno = sc.nextLong();
		System.out.println("Employee Phone Number is: "+empPhoneno);
		
		// empSalary
		System.out.println("Enter Employee Salary");
		double empSalary = sc.nextDouble();
		System.out.println("Employee Salary is: "+empSalary);
		
		// empGender
		System.out.println("Enter Employee Gender");
		String empGender = sc.next();
		System.out.println("Employee Gender is: "+empGender);
		
		// empCity
		System.out.println("Enter Employee City");
		String empCity = sc.nextLine();
		System.out.println("Employee City is: "+empCity);
		
	}

}
