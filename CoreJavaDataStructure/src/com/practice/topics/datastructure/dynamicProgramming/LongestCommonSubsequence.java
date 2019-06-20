package com.practice.topics.datastructure.dynamicProgramming;

public class LongestCommonSubsequence {
	
	//for memoization
	//https://www.geeksforgeeks.org/longest-common-subsequence-dp-using-memoization/
	public static void main(String s[])
	{
		String s1 = "AXYT";
		String s2 = "AYZX";
		
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		
		int m = x.length;
		int n = y.length;
		
		System.out.println(lcs(x,y,m,n));
	}

	
	public static int lcs(char x[], char y[], int m, int n)
	{
		if(m==0||n==0)
		{
			return 0;
		}
		if(x[m-1] ==y[n-1])
		{
			return 1+ lcs(x,y,m-1,n-1);
		}else
		{
			return max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
		}
	}
	
	static int max(int a, int b)
	{
		return a>b?a:b;
	}
}
