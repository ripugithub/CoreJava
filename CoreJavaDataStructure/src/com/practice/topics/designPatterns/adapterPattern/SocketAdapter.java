package com.practice.topics.designPatterns.adapterPattern;

public interface SocketAdapter {

	public Volts get120Volts();
	public Volts get12Volts();
	public Volts get3Volts();
}
