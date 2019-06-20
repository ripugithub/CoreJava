package com.practice.topics.java8;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeCheck {

	public static void main(String s[])
	{
		int n;
		//System.out.println(checkPrime(5));
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number to check");
		n=num.nextInt();
		System.out.println(checkPrime(n));
		
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		Map<Integer,Integer> map = stream.collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(map);
		
		
	}
	public static boolean checkPrime(int num)
	{
		
		//return number>1 && IntStream.range(2, number).noneMatch(index->number%index==0);
		
		//return number>1 && IntStream.range(2, number).noneMatch(index->number%index==0);
		
		return num>1&&IntStream.range(2, num).noneMatch(index->num%index==0);
		
	}
}
