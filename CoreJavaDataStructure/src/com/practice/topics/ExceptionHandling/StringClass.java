package com.practice.topics.ExceptionHandling;

public class StringClass {
	
	public static void main(String[] str)
	{
		String s1 = "abc";
		String s2 = "def";
		
		String s3 = s1.concat(s2.toUpperCase());
		System.out.println(s1+s2+s3);
	}

}
