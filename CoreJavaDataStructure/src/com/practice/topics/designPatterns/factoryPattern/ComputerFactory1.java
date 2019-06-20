package com.hitachi.topics.designPatterns.factoryPattern;

public class ComputerFactory1 {
	
	public static Computer getComputer(String type, String ram, String cpu, String hdd)
	{
		if("PC".equals(type)) {
			return new PC(ram, hdd, cpu);
		}
		else if("Server".equals(type))
		{
			return new Server(ram, hdd, cpu);
		}
		
		else {
			return null;
		}
	}

}
