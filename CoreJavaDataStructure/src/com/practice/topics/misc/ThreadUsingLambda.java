package com.hitachi.topics.misc;

public class ThreadUsingLambda {
	
	public static void main(String s[])
	{
		Runnable runnable = ()->System.out.println("Runnable implementation");
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
