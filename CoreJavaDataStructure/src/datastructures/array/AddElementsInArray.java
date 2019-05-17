package datastructures.array;

public class AddElementsInArray {
	
	private static int count=0;
	
	public static void main(String[] s )
	{
		int[] arr = new int[10];
		insertElementsInArray(arr, 10);
		insertElementsInArray(arr, 20);
		insertElementsInArray(arr, 30);
		insertElementsInArray(arr, 40);
		insertAtStart(arr, 50);
		insertAtPos(arr, 2, 60);
		printArray(arr);
	}
	
	public static void insertElementsInArray(int[] arr, int val)
	{
		arr[count++] = val;
	}
	
	public static void printArray(int[] arr)
	{
		int length = arr.length;
		for(int i=0; i<length-1;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void insertAtStart(int[] arr,int val)
	{
		int length = arr.length;
		for(int i=length-1; i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = val;
	}
	
	public static void insertAtPos(int[] arr, int pos,int val)
	{
		int length = arr.length;
		
		//run for loop for shifting the elements
		for(int i=length-1;i>pos;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos] = val;
	}
	

}
