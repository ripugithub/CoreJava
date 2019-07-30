package com.practice.topics.datastructure;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringOps {
	public static  List<String> list = new ArrayList<String>();

	public static void main(String s[])
	{
		String str = "Ripudaman";
		
		
		System.out.println(str.substring(2,5));
		System.out.println("ABC".substring(2));
		System.out.println("ABC".substring(0));
		printPermutn("ABC", "");
	//	permuteString("aaabbbb", "");
		
		System.out.println("---------------------------");
		list.forEach(name->System.out.println(name));
		/*list.forEach(name->{
			StringBuilder sb = new StringBuilder(name);
			if(list.contains(sb.reverse().toString()))
			{
				System.out.println("STring is :"+sb.toString());
			}
		});*/
		
		System.out.println("**********************"+checkPalindrome());
		
	}

	private static String checkPalindrome() {
		for(String st:list)
		{
			StringBuilder sb = new StringBuilder(st);
			if((sb.reverse().toString()).equals(st))
			{
				System.out.println("The String is:: "+sb);
				return "YES";
			}
		}
		return "NO";
	}
	
	  static void printPermutn(String str, String ans) 
	    { 
	  
	        // If string is empty 
	        if (str.length() == 0) { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	            // ith character of str 
	            char ch = str.charAt(i); 
	  
	            //  Rest of the string after excluding  
	            // the ith character 
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	  
	            // Recurvise call 
	            printPermutn(ros, ans + ch); 
	        } 
	    }
	  
	  static void permuteString(String str, String as)
	  {
		 
		  if(str.length()==0) {
			  System.out.print(as + " "); 
			  list.add(as);
			  return;
		  }
		  
		  int length = str.length();
		  
		  for(int i=0;i<length;i++)
		  {
			  
			  
			  char ch = str.charAt(i);
			  
			  String ros = str.substring(0, i) + str.substring(i+1); //ros = 
			  permuteString(ros, as+ch);
		  }
	  }
}
