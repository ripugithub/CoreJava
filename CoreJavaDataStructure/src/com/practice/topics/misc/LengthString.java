package com.practice.topics.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface StringLength
{
	int getStringLength(String str);
}
public class LengthString {

	public static void main(String s[])
	{
		StringLength length = (str)->str.length();
		System.out.println("Length of String is "+length.getStringLength("Ripudaman"));
		
		
		//
		List<String> list = new ArrayList<String>();
		list.add("Ripu");
		list.add("Amit");
		list.add("Rohit");
		list.add("Neeraj");
		list.add("Raj");
		
		//Collections.sort(list, Collections.reverseOrder());
		list.forEach(names->System.out.println(names));
		
	}
}
