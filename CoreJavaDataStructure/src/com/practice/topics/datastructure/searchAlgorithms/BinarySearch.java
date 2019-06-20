package com.practice.topics.datastructure.searchAlgorithms;

public class BinarySearch {
	
	//Data must be sorted to perform binary search
	//if the data is not sorted we need to use linear search
	public static void main(String s[])
	{
		
		int arr[] = {4,6,8,15,18,25,30};
		int key = 18;
		int last = arr.length;
		binarySearch(arr, 0, last, key);
	}
	
	public static void binarySearch(int arr[], int first, int last, int key)
	{
		
		int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  

	}
	
	
	public static void binarySerch(int[] arr, int first, int last, int key)
	{
		
		int mid = (first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first = mid+1;
			}else if(arr[mid]==key)
			{
				System.out.println("Element found");
				break;
			}
			else {
				last = mid-1;
				
			}
			
		}
		if(first>last)
		{
			System.out.println("Element not found");
		}
	}
	}
