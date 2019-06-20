package com.practice.topics.java8.anonymous;

abstract class Hello1{
	abstract void sayHello();
	abstract void sayHi();
}

public class Anonymous1 {
	
	public static void main(String s[])
	{
		Hello1 hello = new Hello1() {
			
			@Override
			void sayHi() {
				System.out.println("Say Hello");
			}
			
			@Override
			void sayHello() {
				System.out.println("Say Hi");
			}
		};
		
		hello.sayHello();
		hello.sayHi();
		
	}

}
