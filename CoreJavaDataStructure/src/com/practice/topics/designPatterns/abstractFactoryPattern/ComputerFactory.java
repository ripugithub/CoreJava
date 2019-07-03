package com.practice.topics.designPatterns.abstractFactoryPattern;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}

}
