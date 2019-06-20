package com.practice.topics.oca;

import java.util.ArrayList;
import java.util.List;

class StringS{
	String s = "Ripu";
	
	
}

public class StringTest extends StringS {

	String s = "Daman";
	String String = "Singh";
	public static void main(String s[])
	{
		String s1 = "Compare to";
		String s2 = "Compare to to";
		System.out.println(s1.compareTo(s2));
		System.out.println("##"+new StringTest().s+"****"+new StringS().s);
		StringS var = new StringTest();
		StringTest var1 = new StringTest();
		System.out.println(var.s);
		System.out.println(var1.s);
		System.out.println(new StringTest().String);
		
		
	}
	
}
