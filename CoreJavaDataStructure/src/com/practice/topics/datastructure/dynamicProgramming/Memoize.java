package com.practice.topics.datastructure.dynamicProgramming;

public class Memoize {

	
	public static void main(String s[])
	{
		Factorial fact = new Factorial();
		
		System.out.println(fact.factorial(3));
		System.out.println(fact.getMemoizeCache());
		System.out.println(fact.factorial(6));
	}
}
