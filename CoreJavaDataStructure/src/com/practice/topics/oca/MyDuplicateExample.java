package com.practice.topics.oca;

import java.util.HashMap;
import java.util.Set;
import com.practice.topics.oca.bean.Price;



public class MyDuplicateExample {
	public static void main(String s[])
	{
		HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        printMap(hm);
        Set<Price> keys = hm.keySet();
        for(Price price:keys)
        {
        	//System.out.println(price.getPrice()+"::"+price.getItem());
        	//System.out.println("Item::"+hm.get(price));
        	System.out.println("HashCode:::"+price.hashCode());
        }
	}

	
	public static void printMap(HashMap<Price, String> map){
        
        Set<Price> keys = map.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
