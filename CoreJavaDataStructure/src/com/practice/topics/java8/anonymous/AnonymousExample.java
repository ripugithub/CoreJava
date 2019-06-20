package com.practice.topics.java8.anonymous;

import com.hitachi.topics.java8.anonymous.Hello;

/**
 * A class that have no name is known as anonymous inner class in java. 
 * It should be used if you have to override method of class or interface
 *
 */
public class AnonymousExample {
	
	
	public static Hello h = new Hello() {
		@Override
		public void sayHello() {
		System.out.println("Hello from Anonymous inner class "+Hello.JAVA);	
		}

		@Override
		public void sayHi() {
			System.out.println("Say Hi");
			
		}
	};
	
	
	public static void main(String[] s) {
	Hello hello = new Hello() {
		
		@Override
		public void sayHello()
		{
			System.out.println("Hello from Anonymous class inside method");
		}

		@Override
		public void sayHi() {
			System.out.println("Hi from anonymous inner class");
			
		}
		
	};
	
	hello.sayHello();
	AnonymousExample.h.sayHi();
	}
	
}
