package org.test;

public class ConstructorPgm {
	
	// Default constructor
	public ConstructorPgm() {
		this("Java"); // to call other value default constructor must not be empty.
		System.out.println("Default Constructor");
	}
	
	// Argument based constructor
	public ConstructorPgm(int age) {
		this(56.45f);
		System.out.println(age);
	}
	
	public ConstructorPgm(String name) {
		this(45);
		System.out.println(name);
	}
	
	public ConstructorPgm(float avg) {
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		ConstructorPgm cp = new ConstructorPgm();
	}

}
