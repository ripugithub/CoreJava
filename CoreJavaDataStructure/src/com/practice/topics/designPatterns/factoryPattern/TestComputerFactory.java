package com.hitachi.topics.designPatterns.factoryPattern;

public class TestComputerFactory {

	
	public static void main(String s[])
	{
		Computer pc = ComputerFactory.getComputer("PC", "16gb", "512gb", "2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "32gb", "5TB", "2.8GHz");
		
		System.out.println("PC Config::"+pc);
		System.out.println("Server Config::"+server);
	}
}
