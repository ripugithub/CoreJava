package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rare {

	public static int nthMostRare(int[] elements, int n) {
       // throw new UnsupportedOperationException("Waiting to be implemented.");
		List<Integer> adata = new ArrayList<Integer>();
		for(int i=0; i<elements.length;i++)
		{
			adata.add(elements[i]);
		}
		
		int frequency = Collections.frequency(adata, n);
		return frequency;
    }

    public static void main(String[] args) {
        int x = nthMostRare(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}
