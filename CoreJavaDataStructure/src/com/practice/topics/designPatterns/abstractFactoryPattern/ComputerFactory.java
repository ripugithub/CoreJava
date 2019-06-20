package com.hitachi.topics.designPatterns.abstractFactoryPattern;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}

}
