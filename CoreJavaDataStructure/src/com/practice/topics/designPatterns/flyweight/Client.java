package com.hitachi.topics.designPatterns.flyweight;

public class Client {
	
	public static void main(String s[])
	{
		WordProcessor wordProcessor = new WordProcessor();
		
		
		String textToAdd = "Hello from WordProcessor";
		int length = textToAdd.length();
		
		for(int i=0;i<length;i++)
		{
			String value = textToAdd.substring(i, i+1);
			wordProcessor.addLetter(new Letter(value));
		}
		
		wordProcessor.printLetters();
	}

}
