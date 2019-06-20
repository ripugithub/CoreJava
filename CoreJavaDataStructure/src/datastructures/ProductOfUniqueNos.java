package datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductOfUniqueNos {
	
	public static void main(String[] str)
	{
		Integer[] arr = {1,2,3,3, 5,5};
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		int product  = arr[0];
		for(Integer num:set)
		{
			product*= num;
		}
		System.out.println("Product: "+product);
	}

}
