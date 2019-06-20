package com.practice.topics.ExceptionHandling;

public class ExceptionPuzzler {
	
	public static void main(String s[])
	{
		System.out.println(decision());
	}

	/*
	 * in a try-finally statement, the finally block is always executed when control leaves
	 * the try block.
	 * This happens whether try block completes normally or abruptly
	 */
	private static boolean decision() {
		try {
			return true;
			} finally {
			return false;
			}
	}
	
	
	

}
