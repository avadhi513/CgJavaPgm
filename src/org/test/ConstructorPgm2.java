package org.test;

public class ConstructorPgm2 extends ConstructorPgm {
	
	public ConstructorPgm2() {
		super();
		System.out.println("Default Child constructor");
	}
	
	public ConstructorPgm2(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		ConstructorPgm2 cp2 = new ConstructorPgm2();
		ConstructorPgm2 cp3 = new ConstructorPgm2(1000);		
		
	}
	
}
