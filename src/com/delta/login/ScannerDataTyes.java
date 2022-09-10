package com.delta.login;

import java.util.Scanner;

public class ScannerDataTyes {
	
	public static void main(StringMethods[] args) {
		
		Scanner sc = new Scanner(System.in);
		// to call the methods - ctrl + 2, l
		
		// nextLine 
		System.out.println("Enter a name: ");
		String nl = sc.nextLine();
		System.out.println("Value: "+nl);
		
		// next
		System.out.println("Enter a name:");
		String n = sc.next();
		System.out.println("Value is: "+n);
		
		// nextLong
		System.out.println("Enter a phone number:");
		long nlo = sc.nextLong();
		System.out.println("Phn no.: "+nlo);
		
		// nextFloat
		System.out.println("Enter a decimal value:");		
		float nf = sc.nextFloat();
		System.out.println("Avg value is: "+nf);

		// nextDouble
		System.out.println("Enter emp salary:");
		double nd = sc.nextDouble();
		System.out.println("Emp salary is: "+nd);
		
		// nextBoolean
		System.out.println("Enter a default value:");
		boolean nb = sc.nextBoolean();
		System.out.println("Emp status is: "+nb);
		
	}

}
