package com.practice.topics.ExceptionHandling;

public class ParseException {
	
	
	public static void main(String[] str)
	{
		try {
			
			int a = Integer.parseInt("abc");
			System.out.println("Hello");
		}
		catch(NumberFormatException e)
		{
			
		}catch(Exception e)
		{
			
		}
	}

}
