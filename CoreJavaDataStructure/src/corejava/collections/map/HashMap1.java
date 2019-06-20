package corejava.collections.map;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Ripu
 * HashMap stores key value pairs and it does not allow duplicate keys. 
 * If key is duplicate then old key is replaced with new value.However it may have duplicate values.
 * 
 * Initial HashMap size is 16.
 * In case of collision, i.e. index of two or more nodes are same, nodes are joined by link 
 * list i.e. second node is referenced by first node and third by second and so on.
 * Hashcode value of null key is 0.
 * HashMap internally uses hashing to store the values
 *
 */
public class HashMap1 {

	public static void main(String[] args) 
    { 
  
        /* This is how to declare HashMap */
        Map<Integer, String> hm = new HashMap<Integer, String>(); 
  
        /*Adding elements to HashMap*/
        hm.put(101, "Ripu"); 
        hm.put(102, "Raj"); 
        hm.put(103, "Amit"); 
  
        System.out.println("HashMap object output :\n\n" + hm); 
  
        // store data with duplicate key ,this will replace the existing value at the specified key
        hm.put(102, "Rohit"); 
  
        System.out.println("\nAfter inserting duplicate key :\n\n" + hm); 
    } 
}
