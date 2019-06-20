package com.practice.topics.oca;

public class Test {
	
	//public String val = "Ripu";
	
	public String returnString() {
		return "Ripu";
	}
	public static void main(String[] args)
	{
		Test test = new Test();
		System.out.println(test.returnString());
		if (args[0].equals("open"))  {       
			if (args[1].equals("someone")) {           
				System.out.println("Hello!");
			}
		}else System.out.println("Go away "+ args[2]);    
		} 
	}

