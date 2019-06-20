package java8Features.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPrograms {
	
	public static void main(String s[])
	{
		
		
		//Intermediate operations -map, -sorted, -filter
		
		List<Integer> arr = Arrays.asList(20,15,25,32,16);
		//map()-Returns a stream consisting of the results of applying the given function to the elements of this stream
		List square = arr.stream().map(x->x*x).collect(Collectors.toList());
		square.forEach(obj->System.out.println(obj));
		
		List<String> listOfnames = Arrays.asList("Ripu","Amit","Rohit","Raj");
		
		List filteredNames = (List) listOfnames.stream().filter(names->names.startsWith("R")).collect(Collectors.toList());
		
		filteredNames.forEach(val->System.out.println(val));
		
		List sorted = arr.stream().sorted().collect(Collectors.toList());
		sorted.forEach(elem->System.out.println(elem));
		
		listOfnames.stream().map(String::toUpperCase).forEach(name->System.out.println(name));
	
		//Terminal Operations collect, forEach and reduce
		
		//Set set = new TreeSet<Integer>();
		//Set set = new LinkedHashSet<Integer>();
		Set set = new HashSet<Integer>();
		set.add(45);
		set.add(15);
		set.add(25);
		
		
		System.out.println("--------------------");
		set.forEach(num->System.out.println(num));
		
		
		//Map map = new TreeMap<String, Integer>();
		//Map map = new HashMap<String, Integer>();
		Map map = new LinkedHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		
		for(Object val: map.values())
		{
			System.out.println(val.toString());
		}
		
		
		
		
	}

}
