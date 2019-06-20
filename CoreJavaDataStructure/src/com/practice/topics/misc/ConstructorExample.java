package com.practice.topics.misc;

public class ConstructorExample {

	String name;
	public ConstructorExample(String name){
		this.name = name;
	}
	
	
	ConstructorExample(){
		this(makeRandomName());
	}
	
	static String makeRandomName()
	{
		
		//Math.random() generates random numbers which is x where 0.0<x<1.0
		int x = (int) (Math.random()*5);
		String name = new String[] {"Ripu","Raj","Ravi"}[x];
		return name;
	}
	
	public static void main(String s[])
	{
		ConstructorExample a = new ConstructorExample();
		System.out.println(a.name);
		ConstructorExample b = new ConstructorExample("Amit");
		System.out.println(b.name);
		System.out.println(Math.random());
	}
}
