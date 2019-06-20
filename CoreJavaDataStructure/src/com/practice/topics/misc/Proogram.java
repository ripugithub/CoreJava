package com.practice.topics.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author rsingh2
 *
 */
public class Proogram {
	
	public static void main(String s[])
	{
		//******************average of numbers ********************
		//averageNumbers();
		// end
		
		//************** Average of numbers entered by user********************
		
		//averageOfNumbersUserEntered();
		
		//end
		
		//******************Reverese a String recursively*************************
		
	/*	String str = "Hello all";
		String reverse = reverseString(str);
		System.out.println("Reveresed String is: "+reverse);*/
		
		// end
		
		//************************Reversing a String******************************
		
		//reverseString();
		
		//end
		
		//**************************Printing fibonacci series*************************
		
		// 0, 1, 1,2,3,5,8,13
		//printFibonacciSeries();
		
		// end
		
		//*************************Sorting an array in ascending order********************
		//sortNumbers();
		
		//*****************Swapping two numbers without using third variable********************
		//swap2Noswithout3rdVariable();
		
		//**************Reversing word in a sentence*********************
		
		//reverseWordsInString();
		
		//end
		//reverseWordsInString();
		// 9. Factorial of numbers
		
		
		int res =  factorial(5);
		System.out.println("Fatorial result: "+res);
		
		//end
		
		//https://beginnersbook.com/2014/01/java-program-to-check-palindrome-string-using-recursion/
		//10.
		
		//11 print numbers between 1 to 100 without using for loop
		//anagrams are words formed by rearranging the letters.
		printNumbers(10);
		System.out.println(isOdd(11));
		System.out.println(value());
		System.out.println(isAnagram("god","dog"));
		System.out.println(checkAnagram("bat", "tab"));
		
		// {-12, 11, -13, -5, 6, -7, 5, -3, -6}
		//Arrange numbers in such a way that all positive numbers are 
		//on the right side and negative numbers on the left side
		//Time complexity O(n)
		//space complexity O(1)
		//https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		//rearrangeNumbers(arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
		
		//12. Fibonacci Series recursive
		int num=6;
		for(int i=1;i< num;i++)
		{
			System.out.print(fibonacciSeriesRecursive(i)+" " );
		}
		
		//13. Reversing an Integer
		
		//System.out.println(reverseInteger(456789));
		
		//14 Removing junk characters from string
		
		String str = "Ripu~~~daman";
		//str = removeJunk(str);
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		String str1 = "Singh@@@@@#$%^&";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		
	}
	
	

	private static void rearrangeNumbers(int[] arr) {
		
		int length = arr.length;
		int j=0;
		for(int i=0; i<length;i++)
		{
			if(arr[i]<0)
			{
			if(i!=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
			}
		}
	}
	
	
	

	/**
	 * 
	 */
	public static int factorial(int num) {
		if(num==0)
			return 1;
		if(num==1)
			return 1;
		return num*factorial(num-1);
	}
		/**
	 * 
	 */
	/*public static void averageOfNumbersUserEntered() {
		System.out.println("How many number you want to enter? ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Double arr[] = new Double[num];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element number:"+(i+1)+": ");
			arr[i] = scanner.nextDouble();
			
		}
		scanner.close();
		int len = arr.length;
		double total=0;
		
		for(int i=0;i<len;i++)
		{
			total = total+arr[i];
		}
		double avg = total/len;
		System.out.format(" the average: %.2f", avg);
	}*/
	


	/**
	 * 
	 */
	/*public static void averageNumbers() {
		double[] arr = {16, 31, 12,17,19,15};
		double total=0;
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			total=total+arr[i];
		}
		double avg = total/len;
		System.out.format("Average is : %.3f ",avg);
	}*/

	/**
	 * 
	 */
	/*public static void reverseString() {
		System.out.println("Enter the string: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();
		StringBuilder sbr = new StringBuilder();
		
		for(int i=string.length()-1; i>=0;i--)
		{
			sbr.append(string.charAt(i));
		}
		System.out.println("Reversed String is:"+sbr.toString());
		
		}*/
	
	

	/**
	 * 
	 */
	public static void printFibonacciSeries() {
		int x=0,y=1;
		int len=8;
		for(int i=1; i<=len;i++)
		{
			System.out.print(x+" ");
			
			int sum = x+y;
			x=y;
			y=sum;
			
		}
		
	}
	
	public static int fibonacciSeriesRecursive(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else if(num==1)
		{
			return 1;
		}
		
		else return fibonacciSeriesRecursive(num-1)+ fibonacciSeriesRecursive(num-2);
	}

	/**
	 * 
	 */
	public static void reverseWordsInString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence you want to sort the words:");
		String sentence = scanner.nextLine();
		
		String words[] = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		int lenth = words.length;
		for(int i=lenth-1; i>=0; i--)
		{
			sb.append(words[i]).append(" ");
		}
		System.out.println("Reversed String is: "+sb.toString());
	}
	

	/**
	 * Swapping two numbers without using third variable
	 */
	/*public static void swap2Noswithout3rdVariable() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		//10, 15  num1=25, num2=10, num1=15
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After swapping the numbers "+"num1= "+num1+" num2= "+num2);
	}*/

	/**
	 * 
	 */
	/*public static void sortNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		
		int lenth = scanner.nextInt();
		Integer arr[] = new Integer[lenth];
		
		for(int i=0;i<lenth;i++)
		{
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.print("Elements entered are:");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		for(int i=0;i<lenth;i++)
		{
			for(int j=i+1;j<lenth;j++)
			{
				if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
				
			}
		}
		System.out.print(" \n Sorted elements: ");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}*/
	
	/*public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("Returning String 	"+str);
			return str;
		}
		System.out.println(str.substring(1)+str.charAt(0));
		return reverseString(str.substring(1))+str.charAt(0);
	}*/
	
	public static void printNumbers(int num)
	{
		if(num>0)
		{
			printNumbers(num-1);
			System.out.print(num+" ");
			
		}
	}
	
	public static boolean isOdd(int num)
	{
		return num%2!=0;
	}
	
	public static int value()
	{
		return 'c';
	}
	
	public static boolean isAnagram(String source, String target)
	{
		char[] sourceString = source.toCharArray();
		char[] targetString = target.toCharArray();
		
		Arrays.sort(sourceString);
		Arrays.sort(targetString);
		return Arrays.equals(sourceString, targetString);
	}
	
	public static boolean checkAnagram(String first, String second)
	{
		if(first.length()!=second.length())
		{
			return false;
		}
		char[] firstword = first.toCharArray();
		StringBuilder sb = new StringBuilder(second);
		
		
		for(char car:firstword)
		{
			int index = sb.indexOf(""+car);
			if(index!=-1)
			{
				sb.deleteCharAt(index);
			}
		}
		
		return sb.length()==0;
	}
	
	public static long reverseInteger(long num)
	{
		long rev=0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		return rev;
	}
	
	public static String removeJunk(String str)
	{
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		return str;
	}

}
