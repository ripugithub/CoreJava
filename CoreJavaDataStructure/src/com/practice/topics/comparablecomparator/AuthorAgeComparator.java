package com.practice.topics.comparablecomparator;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author1> {
	
	public int compare(Author1 a1, Author1 a2)
	{
		if(a1.auAge==a2.auAge)
			return 0;
		else if(a1.auAge>a2.auAge)
			return 1;
		else
			return -1;
	}

}
