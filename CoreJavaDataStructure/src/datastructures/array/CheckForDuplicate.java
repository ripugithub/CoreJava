package datastructures.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckForDuplicate {
	
	
	public static void main(String[] str)
	{
		Integer[] arr = {5,7,9,4,6,5};
		List list = Arrays.asList(arr);
		System.out.println(list.size());
		
		Set set = new HashSet(Arrays.asList(arr));
		System.out.println(list.size()+" "+set.size());
		
		if(arr.length==set.size())
		{
			System.out.println("Array does not contain duplicate elements");
		}else {
			System.out.println("Array contains duplicate element");
		}
		
		
		checkDuplicate(arr);
			
		
		
	}

	private static void checkDuplicate(Integer[] arr) {
		int length = arr.length;
		Arrays.sort(arr);
		int prev = arr[0];
		
		for(int i=1;i<length;i++)
		{
			int ch = arr[i];
			if(prev==ch)
			{
				System.out.println("Duplicate element is:"+ch);
			}
			prev=ch;
			
		}
		
	}

	
	
}
