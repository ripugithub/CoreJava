package com.practice.topics.java8;

import java.util.stream.IntStream;
interface StringOps{
	String stringOperations(String string);
}
interface NumericTest{
	boolean computeNumber(int n);
}
public class LambdaExample1 {
	
	public static void main(String s[])
	{
		NumericTest testEven = (n)->(n%2) == 0;
		NumericTest testPrime = (n)-> n>1 && IntStream.range(2, n).noneMatch(index->n%index==0);
		
		System.out.println(testEven.computeNumber(5));
		System.out.println(testPrime.computeNumber(11));
		
		System.out.println("Reverse::"+reverseString("Ripudaman"));
		printFibonacciSeries(10);

		//Reverse string using lambda
		
		StringOps str =  string->{
			StringBuilder sb = new StringBuilder(string);
			return sb.reverse().toString();
			};
			System.out.println("New String :"+str.stringOperations("Shweta"));
			sortNumbers();
			System.out.println("***********"+reverseString("Daman"));
	}
	
	
	public static String reverseString(String str)
	{
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		
		System.out.println("Reveresed String is:: "+sb.toString());
		return sb.toString();
		
		
	}
	public static void printFibonacciSeries(int num)
	{
	
		int x=0,y=1;
		for(int i=0;i<num;i++)
		{
			System.out.print(x+" ");
			int sum = x+y;
			x=y;
			y=sum;
		}
	}
	
	public static void sortNumbers() {
		int arr[] = {12,6,4,16,14,25};
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}
	public String reverseStringRec(String str)
	{
		if(str.isEmpty())
		{
			return str;
				
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
