package datastructures.array;

import java.util.Set;
import java.util.TreeSet;

public class SecondHighest {

	public static void main(String[] args) {
		//int[] arr = {86, 46, 47,14, 92, 52, 48, 36, 66, 85};
		int[] arr = {10,20,30,40,50,60};
		/*Set<Integer> nums = new TreeSet<Integer>();
		for(Integer num:arr)
		{
			nums.add(num);
		}

		int size = nums.size();
		Object[] sorted = nums.toArray();
		System.out.println(sorted[size-2]);*/
		
		
		int highest = arr[0];
		int secondHighest = arr[0];
		int length = arr.length;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]>highest)
			{
				secondHighest = highest;
				highest = arr[i];
			}
		}
		System.out.println("Second largest: "+secondHighest);
	}

}
