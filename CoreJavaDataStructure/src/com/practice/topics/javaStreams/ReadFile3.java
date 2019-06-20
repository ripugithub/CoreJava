package com.practice.topics.javaStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadFile3 {

	
	public static void main(String s[])
	{
		
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("D:\\RAD\\personal\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\test.txt"));
		
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		String str = br.readLine();
		
		while(str!=null)
		{
			System.out.println(str);
			for(String val:str.split(" "))
			{
				set.add(val);
				list.add(val);
			}
			str = br.readLine();
		}
		
		for(String compare:set)
		{
			int frequency = Collections.frequency(list, compare);
			System.out.println("Frequency is: "+frequency);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}		
	
}
