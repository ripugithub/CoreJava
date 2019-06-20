package com.practice.topics.java8.anonymous;

 abstract class AbstractClass{
	abstract void sayHello();
}
public class TestAnonymous {

	
	public static void main(String[] s)
	{
		AbstractClass ac = new AbstractClass() {
			
			@Override
			void sayHello() {
				System.out.println("Hello from  Main method through anonymous class");
				
			}
		};
		ac.sayHello();
	}
}
