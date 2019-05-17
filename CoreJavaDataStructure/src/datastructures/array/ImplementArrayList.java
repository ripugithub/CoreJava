package datastructures.array;

import java.util.Arrays;

public class ImplementArrayList {
	private Object[] obj;
	private int actualSize;
	
	public ImplementArrayList()
	{
		obj = new Object[10];
	}
	
	public void add(int element)
	{
		//if the length of the array becomes half of the memory allocated then create new array double of the existing size.
		if(obj.length-actualSize<=5)
		{
			//increase the size by twice
			increaseListSize();
		}
		obj[actualSize++] = element;
	}
	
	public Object get(int index)
	{
		if(index<actualSize)
		{
			return obj[index];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
			
		}
	}
	
	public Object remove(int index)
	{
		if(index<actualSize)
		{
			Object objct = obj[index];
			obj[index] = null; //element at passed index is set to null
			int tmp = index;
			//shift all the elements of the array and decrease the size of the array by one
			while(tmp<actualSize)
			{
				obj[tmp] = obj[tmp+1];
				obj[tmp+1] = null;
				tmp++;
			}
			actualSize--;
			return objct;
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	private void increaseListSize()
	{
		obj = Arrays.copyOf(obj, obj.length*2);
				System.out.println("Lenght of list increased by Twice");
	}
	
	public int size()
	{
		return actualSize;
	}
	//06542245181
	public static void main(String str[])
	{
		ImplementArrayList myList = new ImplementArrayList();
		
		myList.add(25);
		myList.add(36);
		myList.add(45);
		myList.add(18);
		myList.add(42);
		
		System.out.println(myList.size());
		myList.remove(3);
		System.out.println(myList.size());
		System.out.println(myList.get(3));
	}

}
