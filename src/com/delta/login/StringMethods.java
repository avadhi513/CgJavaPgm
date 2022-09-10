package com.delta.login;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s="Selenium", a="Selenium";
		
		
		//charAt
		char ca = s.charAt(2);
		System.out.println(ca);
		
		//toUpperCase
		String up = s.toUpperCase();
		System.out.println(up);
		
		//toLowerCase
		String lc = s.toLowerCase();
		System.out.println(lc);
		
		//startsWith
		boolean sw = s.startsWith("S");
		System.out.println(sw);
		
		//endsWith
		boolean ew = s.endsWith("um");
		System.out.println(ew);
		
		//contains
		boolean con = s.contains("I");
		System.out.println(con);
		
		//length
		int l = s.length();
		System.out.println(l);
		
		//indexOf
		int io = s.indexOf("e");
		System.out.println(io);
		
		//lastIndexOf
		int lio = s.lastIndexOf("e");
		System.out.println(lio);
		
		//replace
		String re = s.replace("e", "a");
		System.out.println(re);
		
		//replaceAll
		String ra = s.replace("Selenium", "Java");
		System.out.println(ra);
		
		//equals
		boolean eq = s.equals(a);
		System.out.println(eq);
		
		//equalsIgnoreCase
		boolean eic = s.equalsIgnoreCase(a);
		System.out.println(eic);
		
		//concat
		String cc = s.concat(a);
		System.out.println(cc);
		
		//trim
		String b="Welcome to Java Classes.";
		String t = b.trim();
		System.out.println("Before trim: "+b);
		System.out.println("After trim: "+t);
		
		//isEmpty
		String c =" ";
		boolean em = c.isEmpty();
		System.out.println(em);
		
		//substring
		String ss = s.substring(2);
		System.out.println(ss);
		
		String ss1 = s.substring(3, 6);
		System.out.println(ss1);
		
		//split
		String[] sp = b.split("e");
		System.out.println(sp[0]);
		
	}

}
