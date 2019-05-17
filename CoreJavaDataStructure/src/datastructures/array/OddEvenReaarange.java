package datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class OddEvenReaarange {

	public static void main(String s[])
	{
	
		int[] arr = {1, 3, 2, 5, 4, 7, 10};
		
		oddEvenReaarange(arr);
		
	}

	private static void oddEvenReaarange(int[] arr) {
		
		List<Integer> oddList = new ArrayList<Integer>();
		List<Integer> evenList = new ArrayList<Integer>();
		
		int length = arr.length;
		for(int i=0;i<length; i++)
		{
			if(arr[i]%2==0)
			{
				evenList.add(arr[i]);
			}
			else {
				oddList.add(arr[i]);
			}
		}
		
		List<Integer> allList = new ArrayList<Integer>();
		
		for(int i=0;i<(length)/2;i++)
		{
			allList.add(oddList.get(i));
			allList.add(evenList.get(i));
				
		}
		System.out.println(evenList+"  "+oddList);
		for(int num:allList)
		{
			
			System.out.print(num+ " ");
		}
			
		
		
	}
	
}
