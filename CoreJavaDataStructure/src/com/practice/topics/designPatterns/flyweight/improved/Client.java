package com.practice.topics.designPatterns.flyweight.improved;

public class Client {
	
	public static void main(String s[])
	{
		WordProcessor wordProcessor = new WordProcessor();
		
		
		String textToAdd = "Hello from WordProcessor";
		int length = textToAdd.length();
		LetterFactory factory = new LetterFactory();
		
		for(int i=0;i<length;i++)
		{
			String value = textToAdd.substring(i, i+1);
			wordProcessor.addLetter(factory.createLetter(value));
		}
		
		wordProcessor.printLetters();
	}

}
