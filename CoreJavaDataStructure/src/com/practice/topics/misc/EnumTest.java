package com.practice.topics.misc;

import java.math.BigDecimal;

enum Color
{
	RED,GREEN,BLUE,YELLOW;
}
abstract class SomeClass{
	
	
	public SomeClass() {
		super();
	}
	public abstract void display();
	public void show()
	{
		System.out.println("From concrete method");
	}
	
}
public class EnumTest {
	public static void main(String s[])
	{
		System.out.println("Color is: "+Color.BLUE);
		
		SomeClass clazz = new SomeClass() {
			
			@Override
			public void display() {
				System.out.println("Display from anonymous implementation of abstract method");
				
			}
		};
		clazz.display();
		clazz.show();
		System.out.println(isOdd(10));
		
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		//avoid float and double where exact answers are required; for monetary calculations, use
		//int, long, or BigDecimal
	}
	
	public static boolean isOdd(int num)
	{
		return num%2!=0;
	}

}
