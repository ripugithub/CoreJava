package com.practice.topics.javaStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://javaconceptoftheday.com/find-most-repeated-word-in-text-file-in-java/
//https://stackoverflow.com/questions/19311084/program-to-find-and-count-repeated-words-in-a-text-the-strings-are-writen-wrong

//To find the words in a file and also print their count of repeatition
public class ReadFile {
private static int count=0;

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("D:\\RAD\\personal\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\test.txt"));
		Set<String> sdata = new HashSet<String>();
		List<String> adata = new ArrayList<String>();
        String s = br.readLine();
		/*while(br.readLine()!=null) {
		System.out.println(br.readLine());
		}*/
        while (s != null) {
        	count++;
        	System.out.println(s);
        	System.out.println("Count::"+count);
            for (String val : s.split(" ")) {
            	System.out.println(val.toString());
            	
                sdata.add(val);
                adata.add(val);
            }
            s = br.readLine();
        }
        for (String val : sdata) {    
            int freq = Collections.frequency(adata, val);
            System.out.println("Frequency of " + val + " " + freq);
        }
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			if(null!=br)
			{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
