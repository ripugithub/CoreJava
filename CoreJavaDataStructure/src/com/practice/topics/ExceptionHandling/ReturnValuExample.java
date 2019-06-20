//Ripu
package com.practice.topics.ExceptionHandling;


//http://www.benchresources.net/returning-value-from-method-having-try-catch-finally-blocks-in-java/
public class ReturnValuExample {
	
	public static void main(String[] args)
	{
		System.out.println(returnValue());
	}
	
	public static int returnValue()
	{
		int result =0;
		try {
			result = 10/0;
			
		}catch(ArithmeticException ae)
		{
			System.out.println("In Catch Block"+ae.getMessage());
			return result;
		}finally {
			System.out.println("In Finally Block");
			//return result;
		}
		return result;
	}

}
