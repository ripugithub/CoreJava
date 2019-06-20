package corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Ripu
 * 
 * HashSet implements set interface
 * 
 * HashSet uses Hashtable as underlying datastructure.
 * 
 * HashSet does’t allow duplicate values
 * 
 * Duplicate elements are not allowed in Hashset as it implements Set interface
 * 
 * HashSet internally uses HashMap to add elements.
 * 
 * Initial capacity is 16 and load factor is .75 so if the 12 elements added in HashSet 
 * it automatically increases to double its original size
 * HashSet h = new HashSet(); 
		Default initial capacity is 16 and default load factor is 0.75.
	HashSet h = new HashSet(int initialCapacity); 
			default loadFactor of 0.75
	HashSet h = new HashSet(int initialCapacity, float loadFactor);
	HashSet h = new HashSet(Collection C);
 *	To get a synchronized HashSet
 * Set set = Collections.synchronizedSet(new HashSet())
 *
 */
public class HashSet1 {

	 public static void main(String[]args) 
	    { 
	        HashSet<String> h = new HashSet<String>(); 
	  
	        // Adding elements into HashSet usind add() 
	        h.add("India"); 
	        h.add("Australia"); 
	        h.add("South Africa"); 
	        h.add("India");// adding duplicate elements 
	  
	        // Displaying the HashSet 
	        System.out.println(h); 
	        System.out.println("List contains India or not:" + 
	                           h.contains("India")); 
	  
	        // Removing items from HashSet using remove() 
	        h.remove("Australia"); 
	        
	        System.out.println("List after removing Australia:"+h); 
	  
	        // Iterating over hash set items 
	        System.out.println("Iterating over list:"); 
	        Iterator<String> i = h.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
	    } 
}
