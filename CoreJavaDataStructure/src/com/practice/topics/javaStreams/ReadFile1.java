package com.practice.topics.javaStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadFile1 {
	public static void main(String s[])
	{
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("D:\\RAD\\personal\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\test.txt"));
		String str;
		Set<String> names = new HashSet<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		while((str=br.readLine())!=null)
		{
			List<String> list = Arrays.asList(str.split(" "));
			//System.out.println("####"+list.stream().findFirst().get());
			for(String tokens:str.split(" "))
			{
			//System.out.println(tokens);
			names.add(tokens);
			Integer val =0;
			if(null!=map.get(tokens))
			{
			 val = Integer.valueOf(map.get(tokens));
			}
			if(map.containsKey(tokens))
			{
				
				map.put(tokens, val+1);
			}
			else {
				map.put(tokens, 1);
			}
				
			}
		}
		
		names.forEach(name->System.out.println(name+" "+map.get(name)));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
