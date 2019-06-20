package com.hitachi.topics.designPatterns.factoryPattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	
	
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
	
	
	
}
