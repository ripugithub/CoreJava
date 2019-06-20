package com.practice.topics.misc;

public class PrintOneToHundred {
	
	public static void main(String s[])
	{
		printNumbers(5);
	}
	
	static void printNumbers(int num)
	{
		if(num>0)
		{
			printNumbers(num-1);
		System.out.print(num+" ");
		
		}
	}

}
