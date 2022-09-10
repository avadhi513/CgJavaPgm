package org.test;

// final @class level
public final class AccessModifier {
	
	// final @method level
	public final void add() {
		
		//final @ variable level
		final int a = 10;
//		a=100;
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.add();
	}
	
}
