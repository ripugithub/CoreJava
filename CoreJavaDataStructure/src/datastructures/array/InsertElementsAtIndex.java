package datastructures.array;

public class InsertElementsAtIndex {

	
	public static void main(String[] s)
	{
		
		int[] arr = {18,34,12,44,36};
		deleteAtPos(arr,6);
		printArray(arr);
	}

	private static void deleteAtPos(int[] arr, int pos) {
		
		int length = arr.length;
		int i=0;
		if(pos<=length-1) {
		for(i=0;i<length;i++)
		{
			if(i==pos)
				break;
		}
		
		for(int j=i;j<length-1;j++)
		{
			arr[j] = arr[j+1];
		}
		}else {
			System.out.println("Index not found");
		}
		
	}
	
	public static void printArray(int[] arr)
	{
		int length = arr.length;
		for(int i=0; i<length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}
