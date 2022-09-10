package com.delta.login;

public class SkipTerminate {
	
	public static void main(StringMethods[] args) {
		int i=0;
		
//		for(i=0; i<10; i++)
//		{
//			if(i==5) 
//			{
//				
//				break;
//			}
//			System.out.println(i);
//			// o/p - 0
//			//       1
//			//       2
//			//       3
//			//       4
//		}
		
		for(i=0; i<=10; i++)
		{
//			if(i==5)
//			{
//				continue;
//			}
//			System.out.println(i);
			
			if(i==5)
			{
				System.exit(0);// break
			}
			System.out.println(i);
		}
		
	}

}
