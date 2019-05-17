package datastructures.array.practice;

import java.util.Arrays;

public class Main {

	public static void main(String[] s)
	{
		int[] arr = {1,1,2,2,3,3,2,2,4,4};
		
		int len = arr.length;
		int[] temp = new int[len];
		Arrays.sort(arr);
		int prev = arr[0];
		temp[0] = arr[0];
		
		for(int i=1;i<len;i++)
		{
			int ch = arr[i];
			if(prev!=ch)
			{
				temp[i]=ch;
			}
			prev = ch;
		}
		
		for(int num:temp)
		{
			System.out.print(num+" ");
		}
	}
	
}
