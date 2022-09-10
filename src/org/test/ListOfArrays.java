package org.test;

import java.util.ArrayList;
import java.util.List;

public class ListOfArrays {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(0);
		li.add(false);
		li.add("Java");
		li.add(8976543120l);
		li.add(87.98f);
		
		System.out.println(li);
		
		// Add values to the list
		List<Integer> lia = new ArrayList<Integer>();		
		lia.add(10);
		lia.add(20);
		lia.add(30);
		lia.add(40);
		lia.add(50);
		lia.add(10);
		
		System.out.println(lia);
		
		// To get the size of the list
		int si = li.size();
		System.out.println(si);
		
		// To get one particular value 
		// *** get will only work on integer values
		Integer ge = lia.get(3);
		System.out.println(ge);
		
		// indexOf
		int io = li.indexOf(10);
		System.out.println(io);
		
		//lastIndexOf
		int lio = lia.lastIndexOf(10);
		System.out.println(lio);
		
		// to add values between the list
		li.add(2, 100);
		System.out.println(li);
		
		//to remove a value
		li.remove(2);
		System.out.println(li);
		
		//to replace a value
		li.set(3, 500);
		System.out.println(li);
		
		List<Integer> lial = new ArrayList<Integer>();	
		
		// to copy values from one list to another
		lial.addAll(lia);
		System.out.println(lial);
		
		lial.add(500);
		System.out.println(lial);
		
			
		// to retain the common values
		lial.retainAll(lia);
		System.out.println(lial);
	    
		// to remove the common values
		lial.removeAll(lia);
		System.out.println(lial);
		
		// Iterate 
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		// Enhanced for loop
		//** enhanced for loop will only work on integer values 
		for(Integer x:lia) {
			System.out.println(x);
		}
		
	}

}
