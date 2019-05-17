package datastructures.array.practice;

import java.util.ArrayList;
import java.util.List;

public class FindUnique {
	
	
	public static void main(String[] str)
	{
		
		int[] arr = {1,2,1,3};
		
		List<Integer> list = findUnique(arr);
		
		list.forEach(num->System.out.print(num+" "));
		
	}

	private static List<Integer> findUnique(int[] arr) {
		List<Integer> uniqueNums = new ArrayList<Integer>();
		
		int length = arr.length;
		
		boolean[] visited = new boolean[length];
		for(int i=0;i<length;i++)
		{
			int num = arr[i];
			if(visited[i]==false)
			{
				boolean isDuplicate = false;
				for(int j=i+1;j<length;j++)
				{
					if(num==arr[j])
					{
						isDuplicate = true;
						visited[j] = true;
					}
				}
				if(!isDuplicate)
				{
					uniqueNums.add(num);
				}
			}
			
		}
		
		return uniqueNums;
	}

}
