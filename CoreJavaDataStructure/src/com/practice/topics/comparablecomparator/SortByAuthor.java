package com.practice.topics.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortByAuthor {
	
	public static void main(String s[])
	{
		ArrayList<Author> authorList = new ArrayList<Author>();
		
		authorList.add(new Author("Frank","Miller", "300"));		
		authorList.add(new Author("Deborah","Hopkinson", "Sky Boys"));
		authorList.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
		authorList.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
		
		
		
		Collections.sort(authorList);
		for(Author author:authorList)
		{
			System.out.println(author.firstname+" "+
					author.lastname+" "+"Book: "+author.bookname);
		}
		
		
		 ArrayList<Author1> al=new ArrayList<Author1>();        
	     al.add(new Author1("Henry", "Tropic of Cancer",  45));
	     al.add(new Author1("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author1("Frank", "300", 65));
	     al.add(new Author1("Deborah", "Sky Boys", 51));
	     al.add(new Author1("George R. R.", "A Song of Ice and Fire", 62));
	     
	     Collections.sort(al, new AuthorAgeComparator());
	    for(Author1 auth:al)
	    {
	    	System.out.println(auth.firstName+" "+
					auth.bookName+" "+"Book: "+auth.auAge);
	    }
	     
	}
	
	
	
	
	

}
