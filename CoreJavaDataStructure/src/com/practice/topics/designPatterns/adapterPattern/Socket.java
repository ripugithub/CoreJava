package com.practice.topics.designPatterns.adapterPattern;

public class Socket {
	
	public Volts getVoltage()
	{
		return new Volts(120);
				
	}

}
