package com.practice.topics.threads;
//Singleton class
public class SingletonClass {
	
	private static SingletonClass instance = null;
	private static Object mutex = new Object();
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		if(instance==null)
		{
			synchronized(mutex) {
			instance = new SingletonClass();
			}
		}
		 return instance;
	}

}
