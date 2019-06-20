package com.practice.topics.ExceptionHandling;

public class ExceptionExercise {
	
	
	public static void main(String s[])
	{
		try {
		System.out.println("Hello");
		throw new RuntimeException();
		}catch(Exception e)
		{
			System.out.println("In catch block");
		}finally {
			System.out.println("Finally block");
		}
	}

}
