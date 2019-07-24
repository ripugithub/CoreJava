package datastructures.array;

public class ArrayRotate {
	
	public static void main(String[] str)
	{
		int[] arr = {5,4,3,7,8};
		
		System.out.println("Before Rotate::");
			printArray(arr);
			
			System.out.println("After Rotation for 4 times::");	
			
			leftRotateByN(arr,5,1);
			printArray(arr);
		
		/*fullArrayRotate(arr);
		printArray(arr);*/
	}
	
	public static void rotateLeftByOne(int[] arr, int size)
	{
		int temp = arr[0];
		
		int i=0;
		
		for(i=0;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void leftRotateByN(int[] arr, int size,int n)
	{
		for(int i=0;i<4;i++)
		{
			rotateLeftByOne(arr, 5);
		}
	}
	
	static void fullArrayRotate(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
