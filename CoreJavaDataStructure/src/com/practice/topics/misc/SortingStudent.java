package com.practice.topics.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStudent {
	
	public static void main(String s[])
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Ripu", "Singh", 31));
		list.add(new Student("Raj", "Maity", 30));
		list.add(new Student("Amit", "Sharma", 30));
		list.add(new Student("Prabhjot", "Singh", 28));
		list.add(new Student("Rohit", "Rajani", 25));
		list.add(new Student("Neeraj", "Kumar", 29));
		
		System.out.println("Before sorting");
		list.forEach((name)->System.out.println(name.getFirstName()+" "+name.getLastName()));
		Collections.sort(list);
		System.out.println("After sorting");
		list.forEach(name->System.out.println(name.getFirstName()+" "+name.getLastName()));
		
		//Sorting based on the age
		Collections.sort(list, new StudentAgeComparator());
		
		System.out.println("After sorting by age");
		list.forEach(name->System.out.println(name.getFirstName()+" "+name.getLastName()));
	}

}
