package com.practice.topics.misc;

public class RunnableImpl {

	public static void main(String s[])
	{
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("from runnable");
				
			}
		};
		runnable.run();
		
	}
}
