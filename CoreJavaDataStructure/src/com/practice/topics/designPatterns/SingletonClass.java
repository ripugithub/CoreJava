package com.practice.topics.designPatterns;

public class SingletonClass {
	
	private static SingletonClass instance;
	
	private SingletonClass() {};
	
	public static SingletonClass getInstance() {
		
		if(null==instance) {
			synchronized(SingletonClass.class) {
				instance = new SingletonClass();
			}
			
		}
		return instance;
	}
}