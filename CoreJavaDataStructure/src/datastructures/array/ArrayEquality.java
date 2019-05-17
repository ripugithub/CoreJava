package datastructures.array;

import java.util.Arrays;

public class ArrayEquality {
	
	public static void main(String[] str) {
	int arr1[] = {1, 2, 3};
    int arr2[] = {1, 2, 3};
    
    //equals
    if (arr1.equals(arr2))//even arr1==arr2 evaluates to false and works in similar fashion as that of equals method
        System.out.println("Same");
    else
        System.out.println("Not same");
    //Arrays.equals method
    if (Arrays.equals(arr1, arr2))
        System.out.println("Same");
    else
        System.out.println("Not same");
	
	
	 if (arr1==arr2)
	        System.out.println("Same");
	    else
	        System.out.println("Not same");
		}
	
	

}
