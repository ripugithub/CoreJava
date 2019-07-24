package datastructures.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharOccurance {
	
	
	public static void main(String[] str)
	{
		//int n=20;
		String s = "aba";
		StringBuilder sb = new StringBuilder();
		
			char[] ch = s.toCharArray();
			while(sb.length()!=10)
			{
				for(int i=0;i<ch.length;i++)
				{
					if(sb.length()!=10)
						sb.append(ch[i]);
				}
			}
		System.out.println(sb.toString());
		
		List<String> list = new ArrayList<String>();
		for(char c:sb.toString().toCharArray())
		{
			list.add(c+"");
		}
		
		int n = Collections.frequency(list, "a");
		//list.forEach(chs->System.out.println(chs));
		System.out.println(n);
	}

}
