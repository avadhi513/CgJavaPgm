package org.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
		
		// To add values to the map
		mp.put(10, "JAVA");
		mp.put(20, "API");
		mp.put(30, "API");
		mp.put(40, "AWS");
		mp.put(10, "SEL");
		
		System.out.println(mp);
		
		// To get particular value from the map
		String stmp = mp.get(30);
		System.out.println(stmp);
		
		// To check particular key is present or not
		boolean ck = mp.containsKey(30);
		System.out.println(ck);
		
		// To check particular value is present or not
		boolean cv = mp.containsValue("aws");
		System.out.println(cv);
		
		// To print only the keys
		Set<Integer> ks = mp.keySet();
		System.out.println(ks);
		
		// To print only the values
		Collection<String> vs = mp.values();
		System.out.println(vs);
		
		// Iterate
		Set<Entry<Integer, String>> es = mp.entrySet();
		System.out.println(es);
		for(Entry<Integer, String> x : es) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
		
	}

}
