package com.practice.topics.datastructure.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
	private List<Long> memoizeCache = new ArrayList<Long>();
	
	
	public  long factorial(int num)
	{
		
		if(num==0)
		{
			return 1;
		}
		else {
			
			if(memoizeCache.size()>= num)
			{
				System.out.println("Retrieving from cache");
				return memoizeCache.get(num-1);
			}
			long fact = num*factorial(num-1);
			memoizeCache.add(fact);
			return fact;
		}
	}


	public List<Long> getMemoizeCache() {
		return memoizeCache;
	}
	
	/* public List<Integer> memoizeCache = new ArrayList<>();

	    public Integer factorial(Integer input) {

	        if (input == 0) {
	            return 1;
	        } else {
	            if (memoizeCache.size() >= input) {
	                System.out.println("Retrieved from cache: " + input);
	                return memoizeCache.get(input - 1);
	            }
	            System.out.println("Calculate for input:" + input);
	            int factorial = input * factorial(input - 1);
	            memoizeCache.add(factorial);
	            return factorial;
	        }
	    }

	    public List<Integer> getMemoizeCache() {
	        return memoizeCache;
	    }*/
	

}
