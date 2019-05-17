package datastructures.array.practice;

import java.util.Arrays;
import java.util.List;

public class Average {

	
	public static double mean(List<Integer> numbers, List<Integer> weights)
    {
		int total = 0;
        int totalWeights = 0;
		if(numbers.size()>0&&weights.size()>0&&numbers.size()==weights.size())
		{
        
        for (int i = 0; i < numbers.size(); i++)
        {
            total += numbers.get(i) * weights.get(i);
            totalWeights += weights.get(i);
        }

        
		}
		else {
			throw new IllegalArgumentException();
		}
		return total / totalWeights;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(Average.mean(a, b));
    }
}
