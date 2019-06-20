package com.practice.topics.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] str)
	{
		//We can use java Stream collect() method to get List, Map or Set from stream.
		Stream<Integer> mapStream = Stream.of(1,2,3,4,5);		
		Map<Integer,Integer> map = mapStream.collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(map);
		
		
		
		//toList
		Stream<Integer> listStream = Stream.of(1,2,3,4,5);		
		List<Integer> list = listStream.collect(Collectors.toList());
		System.out.println(list);
		
		
		IntStream is2 = "abc".chars();
		System.out.println(is2);
		
		
		List<String> names = Arrays.asList("Ripu","Amit","Raj","Rohit","Niraj");
		//List<String> result = names.stream().filter(name->name.startsWith("R")).collect(Collectors.toList());
		//System.out.println(result);
		List<String> result = names.stream().filter(name->name.startsWith("N")).collect(Collectors.toList());
		
		System.out.println(result);
		
		
	}

}
