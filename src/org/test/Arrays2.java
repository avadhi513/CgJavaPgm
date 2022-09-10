package org.test;

public class Arrays2 {
		
	public static void main(String[] args) {
			
			int num[] = new int[5];
			
			num[0] = 10;
			num[1] = 20;
			num[2] = 30;
			num[3] = 40;
			num[4] = 50;
			
			System.out.println(num[0]);
			
			// length
			int len = num.length;
			System.out.println(len);
			
			// Iterate For Loop
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
			
			// Enhanced For Loop or for each
			for(int x:num) {
				System.out.println(x);
		}


}
	
}
