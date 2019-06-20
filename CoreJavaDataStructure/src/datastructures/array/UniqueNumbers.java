package datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNumbers {

	
public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) throws UnsupportedOperationException{
	
      //  List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
	List<Integer> list = new ArrayList<>();
			Integer[] arr = (Integer[])numbers.toArray();
			
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (visited[i] == false) {
				boolean isDuplicate = false;
				for (int j = i + 1; j < arr.length; j++) {
					if (x == arr[j]) {
						isDuplicate = true;
						visited[j] = true;
					}
				}
				if (!isDuplicate)

					list.add(x);
			}
		}

		// throw new UnsupportedOperationException("Waiting to be implemented.");
		return list;
	}

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
        
        int [] a = { 1,5,6,2,1,6,4,3,2,5,3};
        findUniqueNumber(a);
       
    }
    
    
    public static void findUniqueNumber(int[] arr)
    {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if(map.containsKey(arr[i]))
    		{
    			int count = map.get(arr[i]);
    			map.put(arr[i], ++count);
    		}else
    		{
    			map.put(arr[i], 1);
    		}
    	}
    	
    	Set<Integer> set = map.keySet();
    	for(Integer key:set)
    	{
    		int val = map.get(key);
    		if(val==1)
    		{
    			System.out.println("Non repeat Number:"+key);
    		}
    	}
    }
}
