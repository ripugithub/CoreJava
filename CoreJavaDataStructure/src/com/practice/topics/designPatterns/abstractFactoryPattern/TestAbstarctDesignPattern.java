package com.hitachi.topics.designPatterns.abstractFactoryPattern;

public class TestAbstarctDesignPattern {

	public static void main(String s[])
	{
		testAbstarctFactory();
	}
	
	public static void testAbstarctFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("16gb", "512gb", "2.4GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("32gb", "1TB", "2.9GHz"));
		
		System.out.println("PC Config::" +pc);
		System.out.println("Server COnfig::"+server);
	}
}
