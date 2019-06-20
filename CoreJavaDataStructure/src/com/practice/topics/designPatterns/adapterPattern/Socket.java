package com.hitachi.topics.designPatterns.adapterPattern;

public class Socket {
	
	public Volts getVoltage()
	{
		return new Volts(120);
				
	}

}
