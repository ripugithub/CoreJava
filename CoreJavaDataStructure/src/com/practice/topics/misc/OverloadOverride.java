package com.practice.topics.misc;


class MathOperation
{
	
	static int sum(int a,int b){return a+b;}  
	//static double sum(int a,int b){return a+b;}    /duplicate method error
	public void add(int a, int b)
	{
		System.out.println("Sum of numbers is " +(a+b));
	}
}
public class OverloadOverride extends MathOperation{

	public void add(int a, int b)
	{
		System.out.println("Sum of numbers from overriden method " +(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Sum of numbers from overloaded: "+(a+b+c));
	}
	public static void main(String[] args)
	{
		OverloadOverride var = new OverloadOverride();
		var.add(10, 20);
		
		MathOperation opr = new OverloadOverride();
		opr.add(15, 12);
		//opr.add(16, 17, 18);  //will not compile since the base class is not having the 
								//add method which takes three parameters
		
	}
}
