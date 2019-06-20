package com.practice.topics.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample1 {
	
	public static void main(String s[])
	{
		List<String> list = new ArrayList<String>();
				list.add("Ripu");
		list.add("Raj");
		list.add("Amit");
		list.add("Rohit");
		list.add("Neeraj");
		
		
		
		list.forEach(n->System.out.println(n));
		
		//System.out.println(list);
	}

}
