package com.delta.login;

import java.util.Scanner;

public class PracticeQuestions {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Find the length of Technology
		String st = "Technology";
		int stl = st.length();
		System.out.println(stl);
		// last index of 'o'
		int stlio = st.lastIndexOf("o");
		System.out.println(stlio);
		// print character 'h'
		char stca = st.charAt(3);
		System.out.println(stca);
		
		// Find the length of SeleniumAutomationtool
		String sat = "SeleniumAutomationtool";
		int satl = sat.length();
		System.out.println(satl);
		// index of 'o'
		int satio = sat.indexOf("o");
		System.out.println(satio);
		// print character 'o'
		char satca = sat.charAt(11);
		System.out.println(satca);
		
		// Find the length of j a v a p r o g r a m
		String sjp = "j a v a p r o g r a m";
		int sjpl = sjp.length();
		System.out.println(sjpl);
		// last index of emptyspace
		int sjplio = sjp.lastIndexOf(" ");
		System.out.println(sjplio);
		// print character 'p'
		char sjpca = sjp.charAt(8);
		System.out.println(sjpca);
		
		// Find the length of 9085484678
		String sn = "9085484678";
		int snl = sn.length();
		System.out.println(snl);
		// last index of '8'
		int snlio = sn.lastIndexOf("8");
		System.out.println(snlio);
		// print '7'
		char snca = sn.charAt(8);
		System.out.println(snca);
		
		
		
		
		
		// check equality
		String st1 ="Java";
		String st2 ="Java";
		boolean stb = st1.equals(st2);
		System.out.println(stb);
		String st5 ="java";
		boolean stb1 = st1.equalsIgnoreCase(st5);
		System.out.println(stb1);
		
		String st3 ="Technology";
		String st4 ="Technology";
		boolean stb2 = st3.equalsIgnoreCase(st4);
		System.out.println(stb2);
		
		
		
		
		// replace
		String str ="Welcome to java class";
		System.out.println(str);
		// replace java with sql
		String strr = str.replace("java", "sql");
		System.out.println(strr);
		// replace space with #
		String strr1 = str.replace(" ", "#");
		System.out.println(strr1);
		
		String str2 ="Chennai Adayar";
		System.out.println(str2);
		String strr2 = str2.replace("Adayar", "Omr");
		System.out.println(strr1);
		
		System.out.println("Enter your email address");
		String eminp = sc.next();
		System.out.println("Email address f the user is: "+eminp);
		
		
	}

}
