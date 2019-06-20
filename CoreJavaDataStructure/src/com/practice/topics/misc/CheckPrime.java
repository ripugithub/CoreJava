package com.practice.topics.misc;

import java.util.stream.IntStream;

public class CheckPrime {

	
	public static void main(String s[])
	{
		System.out.println(isPrimeCheck((5)));
		
		int num = ConvertIntoNumeric("7");
		System.out.println(num);
	}

	private static boolean isPrime(int num) {
		return num>1 && IntStream.range(2, num).noneMatch(i->num%i==0);
	}
	
	private static boolean isPrimeCheck(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
				
		}
		return true;
	}
	private static int ConvertIntoNumeric(String xVal)
	{
		
	 try
	  { 
	     return Integer.parseInt(xVal);
	  }
	 catch(Exception ex) 
	  {
		 System.out.println("In exception block");
	     return 0; 
	  }
	}
}
