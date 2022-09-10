package com.delta.login;

public class TypesOfString {
	
	public static void main(String[] args) {
		
		//Literal String
		String a = "Java";
		String b = "Java";
		System.out.println("*****Literal String*****");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		
		//Immutable - after concat it will store in different m/y address
		String cc = a.concat(b);
		System.out.println("*****Immutable String*****");
		System.out.println(System.identityHashCode(cc));
		
		
		//Non-Literal
		String c = new String("Java");
		String d = new String("Java");
		System.out.println("*****Non-Literal String*****");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
		//Mutable - String buffer - after append it will go in first reference name
		StringBuffer e = new StringBuffer("Java");
		StringBuffer f = new StringBuffer("Java");
		StringBuffer sbf = e.append(f);
		System.out.println("*****Mutable String Buffer*****");
		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(f));
		System.out.println(System.identityHashCode(sbf));
		
		
		//Mutable - String builder - after append it will go in first reference name
		StringBuilder g = new StringBuilder("Java");
		StringBuilder h = new StringBuilder("Java");
		StringBuilder sbld = g.append(h);
		System.out.println("*****Mutable String Builder*****");
		System.out.println(System.identityHashCode(g));
		System.out.println(System.identityHashCode(h));
		System.out.println(System.identityHashCode(sbld));
		
	}
	
}
