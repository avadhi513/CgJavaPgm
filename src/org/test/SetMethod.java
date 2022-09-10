package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod {
	
	public static void main(String[] args) {
		
		Set<Integer> se = new LinkedHashSet<Integer>();
		
		// Add the value to the list
		se.add(10);
		se.add(20);
		se.add(30);
		se.add(40);
		se.add(50);
		se.add(10);
		
		System.out.println(se);
		
		// To find the size of the set
		int si = se.size();
		System.out.println(si);
		
		// To remove any values from the set
		se.remove(20);
		System.out.println(se);
		
		// To check whether particular value is present or not
		boolean co = se.contains(30);
		System.out.println(co);
		
		// To check is empty or not
		boolean em = se.isEmpty();
		System.out.println(em);
		
		// To remove all the values from the set
		/*se.clear();
		System.out.println(se); */
		
		// Enhanced for loop
		for(Integer x : se) {
			System.out.println(x);
		}
		
	}

}
