package com.delta.login;

public class LadderIfElse {
	
	public static void main(StringMethods[] args) {
		
		int a=20;
		int b= 22, c=200,d=40;
		
		if(a>b && a>b && a>d)
		{
			System.out.println("A is greater");
		}
		
		else if(b>c && b>d && b>a)
		{
			System.out.println("B is greater");
		}
		
		else if(c>d && c>a && c>b)
		{
			System.out.println("C is greater");
		}
		
		else
		{
			System.out.println("D is greater");
		}
			
	}

}
