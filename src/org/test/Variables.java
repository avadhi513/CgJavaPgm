package org.test;

public class Variables {
	
	// Local variable @method level
	private void variableName(String name) {
		System.out.println("Name: "+name);
	}
	
	// Local variable @Constructor level
	private void variableName(int age) {
		System.out.println("Age: "+age);
	}
	
	// Instance variable @Class level
	int a = 10, b=20;
	int c;
	
	private void addition() {
		c=a+b;
		System.out.println("Added value: "+c);
	}
	
	private void subtraction() {
		c=a-b;
		System.out.println("Subtracted value: "+c);
	}
	
	// Static variable @ Class level
	static int num1 = 10, num2=20;
	static int mul;
	
	public static void multiply() {
		mul = num1*num2;
		System.out.println("Multiplied value is: "+mul);
	}
	
	public static void main(String[] args) {
		Variables v = new Variables();
		v.variableName("Java");
		v.variableName(24);
		
		v.addition();
		v.subtraction();
		
		
		multiply();
		Variables.multiply();
		
	// Local variable @Block level
		for(int i=0; i<=10; i++) {
			System.out.println("Block values "+i);
		}
		
	}

}
