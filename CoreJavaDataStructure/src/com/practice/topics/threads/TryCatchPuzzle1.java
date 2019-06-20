package com.hitachi.topics.threads;

import java.io.IOException;

public class TryCatchPuzzle1 {
	
	public static void main(String s[])
	{
		try {
			System.out.println("Hi");
		//}catch(IOException e)   //it is a compile-time error for a
			                      //catch clause to catch a checked exception type E if the corresponding TRy clause can't throw an
								  //exception of some subtype of E
			
		}catch(Exception e)			//catch clauses that catch Exception or Throwable are legal regardless of the contents of the
									//corresponding try clause.
		{
			
		}
		{
			
		}
	}

}
