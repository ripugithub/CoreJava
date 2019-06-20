package com.practice.topics.java8;

public class RunnableExample {
	
	public static void main(String s[])
	{
		Runnable run = ()->System.out.println("From Runnable");
		run.run();
	}

}
